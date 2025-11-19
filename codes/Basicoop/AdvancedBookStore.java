package Basicoop;
import java.util.*;

class Book {
    private int id;
    private String title;
    private String author;
    private double rate;
    private int unit;
    private int soldCount;

    public Book(int id, String title, String author, double rate, int unit) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.rate = rate;
        this.unit = unit;
        this.soldCount = 0;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getRate() { return rate; }
    public int getUnit() { return unit; }

    public void setRate(double rate) { this.rate = rate; }
    public void setUnit(int unit) { this.unit = unit; }

    public void addSales(int count) { this.soldCount += count; }

    public double getRevenue() {
        return rate * soldCount;
    }

    public void display() {
        System.out.printf("%-5d %-13s %-13s %-8.2f %-6d\n", id, title, author, rate, unit);
    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private Scanner sc;

    public Library(Scanner sc) {
        this.sc = sc;
    }

    public void addBook() {
        System.out.print("Enter number of books to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            try {
                System.out.println("\n---- Book " + (i + 1) + " Info ----");
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Book Title: ");
                String title = sc.nextLine();
                System.out.print("Enter Author Name: ");
                String author = sc.nextLine();
                System.out.print("Enter Rate: ");
                double rate = sc.nextDouble();
                System.out.print("Enter Units in Stock: ");
                int unit = sc.nextInt();
                sc.nextLine();

                books.add(new Book(id, title, author, rate, unit));
                System.out.println("Book added successfully.");

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please try again.");
                sc.nextLine(); 
                i--; 
            }
        }
    }

    public void display() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("\n==== BOOK LIST ====");
        System.out.printf("%-5s %-13s %-13s %-8s %-6s\n", "ID", "Title", "Author", "Rate", "Stock");
        for (Book b : books) b.display();
    }

    public void search() {
        System.out.print("Enter the ID of the book to search: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Book b : books) {
            if (b.getId() == id) {
                System.out.printf("%-5s %-13s %-13s %-8s %-6s\n", "ID", "Title", "Author", "Rate", "Stock");
                b.display();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void update() {
        System.out.print("Enter the ID of the book to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Book b : books) {
            if (b.getId() == id) {
                System.out.println("What do you want to update?");
                System.out.println("1. Rate\n2. Stock");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter new rate: ");
                        double rate = sc.nextDouble();
                        b.setRate(rate);
                        System.out.println("Rate updated successfully.");
                    }
                    case 2 -> {
                        System.out.print("Enter new stock: ");
                        int stock = sc.nextInt();
                        if (stock < 0)
                            System.out.println("Invalid stock count!");
                        else {
                            b.setUnit(stock);
                            System.out.println("Stock updated successfully.");
                        }
                    }
                    default -> System.out.println("Invalid choice!");
                }
                return;
            }
        }
        System.out.println("Book not found in library.");
    }

    public void delete() {
        System.out.print("Enter the Book ID to delete: ");
        int id = sc.nextInt();

        Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            Book b = it.next();
            if (b.getId() == id) {
                it.remove();
                System.out.println("Book deleted successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void sale() {
        if (books.isEmpty()) {
            System.out.println("No books available for sale.");
            return;
        }

        System.out.print("Enter the Book ID to buy: ");
        int id = sc.nextInt();

        for (Book b : books) {
            if (b.getId() == id) {
                System.out.println("Book Found: " + b.getTitle() + " by " + b.getAuthor());
                System.out.println("Available Units: " + b.getUnit());
                System.out.print("Enter number of units to buy: ");
                int count = sc.nextInt();

                if (count <= 0) {
                    System.out.println(" Invalid quantity.");
                    return;
                }
                if (count > b.getUnit()) {
                    System.out.println(" Not enough stock available!");
                    return;
                }

                double total = count * b.getRate();
                b.setUnit(b.getUnit() - count);
                b.addSales(count);

                System.out.println("Sale successful!");
                System.out.println("Total Price: Rs." + total);
                System.out.println("Remaining Units: " + b.getUnit());
                return;
            }
        }
        System.out.println("Book not found.");
    }
}

public class AdvancedBookStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library(sc);

        int choice;
        System.out.println(" Welcome to Eshwar Library");

        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Add New Books");
            System.out.println("2. Display All Books");
            System.out.println("3. Search a Book");
            System.out.println("4. Update a Book");
            System.out.println("5. Delete a Book");
            System.out.println("6. Buy a Book");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> library.addBook();
                case 2 -> library.display();
                case 3 -> library.search();
                case 4 -> library.update();
                case 5 -> library.delete();
                case 6 -> library.sale();
                case 7 -> System.out.println(" Thank you! Visit again.");
                default -> System.out.println(" Invalid choice. Please try again.");
            }
        } while (choice != 7);

        sc.close();
    }
}
