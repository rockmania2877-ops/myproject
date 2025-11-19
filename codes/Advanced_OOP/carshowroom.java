package Advanced_OOP;
import java.util.*;
class car {
    private String brand;
    private String model;
    private int stock;
    private double price;
    private int year;
    private String category;

    public car(String brand, String model, int stock, double price, int year, String category) {
        this.brand = brand;
        this.model = model;
        this.stock = stock;
        this.price = price;
        this.year = year;
        this.category = category;
    }

    public car() {}

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getStock() { return stock; }
    public double getPrice() { return price; }
    public int getYear() { return year; }
    public String getCategory() { return category; }

    public void setStock(int stock) { this.stock = stock; }
    public void setPrice(double price) {
        this.price = price;
        setCategory(price); 
    }

    public void setCategory(double price) {
        if (price < 5_000_000) this.category = "Normal";
        else this.category = "Luxury";
    }

    public void displayBase() {
        System.out.printf("%-12s %-12s %-6d %-8d %-12.2f %-10s",
                brand, model, year, stock, price, category);
    }
}

class SUV extends car {
    private static ArrayList<SUV> suv = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    private int capacity;

    public SUV(String brand, String model, int stock, double price, int year, int capacity) {
        super(brand, model, stock, price, year, (price < 5_000_000 ? "Normal" : "Luxury"));
        this.capacity = capacity;
    }

    public SUV() {}

    public int getCapacity() { return capacity; }

    public void addSUV() {
        System.out.print("Enter the number of SUVs to add: ");
        int n = sc.nextInt();
        try {
            n = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Returning to menu.");
            sc.nextLine();
            return;
        }

        for (int i = 0; i < n; i++) {
            try {
                System.out.print("Enter brand: ");
                String brand = sc.nextLine();
                System.out.print("Enter model: ");
                String model = sc.nextLine();
                System.out.print("Enter stock: ");
                int stock = sc.nextInt();
                System.out.print("Enter price: ");
                double price = sc.nextDouble();
                System.out.print("Enter year: ");
                int year = sc.nextInt();
                System.out.print("Enter seating capacity (6 or 7): ");
                int capacity = sc.nextInt();
                sc.nextLine();

                if (stock < 0 || price < 0 || year <= 0 || (capacity != 6 && capacity != 7)) {
                    System.out.println("Invalid values entered. This entry will be skipped.");
                    continue;
                }
                if (year <= 2010) {
                    System.out.println("Car is not eligible for sale (year <= 2010). Skipping.");
                    continue;
                }
                if (year > 2025) {
                    System.out.println("Car is yet to launch (year > 2025). Skipping.");
                    continue;
                }

                SUV obj = new SUV(brand, model, stock, price, year, capacity);
                suv.add(obj);
                System.out.println("SUV added successfully.");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, skipping this entry.");
                sc.nextLine();
            }
        }
    }

    public void displaySUV() {
        if (suv.isEmpty()) {
            System.out.println("There are no SUVs available.");
            return;
        }
        System.out.printf("%-12s %-12s %-6s %-8s %-12s %-10s %-8s\n",
                "BRAND", "MODEL", "YEAR", "STOCK", "PRICE(Rs)", "CATEGORY", "CAP");
        for (SUV s : suv) {
            s.displayBase();
            System.out.printf(" %-6d\n", s.getCapacity());
        }
    }

    public void searchSUV() {
        if (suv.isEmpty()) {
            System.out.println("There are no SUVs available.");
            return;
        }
        System.out.print("Enter the brand to search: ");
        String brand = sc.nextLine();
        boolean found = false;
        System.out.printf("%-12s %-12s %-6s %-8s %-12s %-10s %-8s\n",
                "BRAND", "MODEL", "YEAR", "STOCK", "PRICE(Rs)", "CATEGORY", "CAP");
        for (SUV s : suv) {
            if (s.getBrand().equalsIgnoreCase(brand)) {
                found = true;
                s.displayBase();
                System.out.printf(" %-6d\n", s.getCapacity());
            }
        }
        if (!found) System.out.println("Brand not available.");
    }

    public void buySUV() {
        if (suv.isEmpty()) {
            System.out.println("There are no SUVs available.");
            return;
        }
        System.out.print("Enter brand: ");
        String brand = sc.nextLine();
        System.out.print("Enter model: ");
        String model = sc.nextLine();

        SUV target = null;
        for (SUV s : suv) {
            if (s.getBrand().equalsIgnoreCase(brand) && s.getModel().equalsIgnoreCase(model)) {
                target = s;
                break;
            }
        }
        if (target == null) {
            System.out.println("No such SUV found.");
            return;
        }

        System.out.print("Enter the count to buy: ");
        int count;
        try {
            count = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Invalid number.");
            sc.nextLine();
            return;
        }
        if (count <= 0) {
            System.out.println("Invalid number.");
            return;
        }
        if (count > target.getStock()) {
            System.out.println("Not enough stock.");
            return;
        }
        double bill = count * target.getPrice();
        target.setStock(target.getStock() - count);
        System.out.println("Thank you! Your bill: Rs." + bill);
    }

    public void deleteSUV() {
        if (suv.isEmpty()) {
            System.out.println("There are no SUVs available.");
            return;
        }
        System.out.print("Enter brand to delete: ");
        String brand = sc.nextLine();
        System.out.print("Enter model to delete: ");
        String model = sc.nextLine();

        Iterator<SUV> it = suv.iterator();
        boolean found = false;
        while (it.hasNext()) {
            SUV s = it.next();
            if (s.getBrand().equalsIgnoreCase(brand) && s.getModel().equalsIgnoreCase(model)) {
                it.remove();
                found = true;
                System.out.println("SUV deleted.");
                break;
            }
        }
        if (!found) System.out.println("No such SUV available.");
    }

    public void updateSUV() {
        if (suv.isEmpty()) {
            System.out.println("There are no SUVs available.");
            return;
        }
        System.out.print("Enter brand to update: ");
        String brand = sc.nextLine();
        System.out.print("Enter model to update: ");
        String model = sc.nextLine();

        SUV target = null;
        for (SUV s : suv) {
            if (s.getBrand().equalsIgnoreCase(brand) && s.getModel().equalsIgnoreCase(model)) {
                target = s;
                break;
            }
        }
        if (target == null) {
            System.out.println("No such SUV found.");
            return;
        }

        System.out.println("1. Update Stock\n2. Update Price");
        int choice;
        try {
            choice = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Invalid choice.");
            sc.nextLine();
            return;
        }

        switch (choice) {
            case 1 -> {
                System.out.print("Enter new stock: ");
                int stock = sc.nextInt();
                sc.nextLine();
                if (stock < 0) { System.out.println("Invalid number."); return; }
                target.setStock(stock);
                System.out.println("Stock updated.");
            }
            case 2 -> {
                System.out.print("Enter new price: ");
                double price = sc.nextDouble();
                sc.nextLine();
                if (price < 0) { System.out.println("Invalid number."); return; }
                target.setPrice(price);
                System.out.println("Price updated.");
            }
            default -> System.out.println("Invalid choice.");
        }
    }
}

class SEDAN extends car {
    private static ArrayList<SEDAN> sedan = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    private int volume; 
    private final int capacity = 5;

    public SEDAN(String brand, String model, int stock, double price, int year, int volume) {
        super(brand, model, stock, price, year, (price < 5_000_000 ? "Normal" : "Luxury"));
        this.volume = volume;
    }

    public SEDAN() {}

    public int getVolume() { return volume; }
    public int getCapacity() { return capacity; }

    public void addSedan() {
        System.out.print("Enter number of Sedans to add: ");
        int n;
        try {
            n = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
            sc.nextLine();
            return;
        }

        for (int i = 0; i < n; i++) {
            try {
                System.out.print("Enter brand: ");
                String brand = sc.nextLine();
                System.out.print("Enter model: ");
                String model = sc.nextLine();
                System.out.print("Enter stock: ");
                int stock = sc.nextInt();
                System.out.print("Enter price: ");
                double price = sc.nextDouble();
                System.out.print("Enter year: ");
                int year = sc.nextInt();
                System.out.print("Enter cargo volume: ");
                int volume = sc.nextInt();
                sc.nextLine();

                if (stock < 0 || price < 0 || year <= 0 || volume < 0) {
                    System.out.println("Invalid values. Skipping entry.");
                    continue;
                }
                if (year <= 2010) {
                    System.out.println("Car is not eligible for sale (year <= 2010). Skipping.");
                    continue;
                }
                if (year > 2025) {
                    System.out.println("Car is yet to launch (year > 2025). Skipping.");
                    continue;
                }

                SEDAN obj = new SEDAN(brand, model, stock, price, year, volume);
                sedan.add(obj);
                System.out.println("Sedan added successfully.");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, skipping.");
                sc.nextLine();
            }
        }
    }

    public void dispalySEDAN() {
        if (sedan.isEmpty()) {
            System.out.println("There are no Sedans available.");
            return;
        }
        System.out.printf("%-12s %-12s %-6s %-8s %-12s %-10s %-8s %-6s\n",
                "BRAND", "MODEL", "YEAR", "STOCK", "PRICE(Rs)", "CATEGORY", "CAP", "VOL");
        for (SEDAN s : sedan) {
            s.displayBase();
            System.out.printf(" %-6d %-6d\n", s.getCapacity(), s.getVolume());
        }
    }

    public void searchSEDAN() {
        if (sedan.isEmpty()) {
            System.out.println("There are no Sedans available.");
            return;
        }
        System.out.print("Enter brand to search: ");
        String brand = sc.nextLine();
        boolean found = false;
        System.out.printf("%-12s %-12s %-6s %-8s %-12s %-10s %-8s %-6s\n",
                "BRAND", "MODEL", "YEAR", "STOCK", "PRICE(Rs)", "CATEGORY", "CAP", "VOL");
        for (SEDAN s : sedan) {
            if (s.getBrand().equalsIgnoreCase(brand)) {
                found = true;
                s.displayBase();
                System.out.printf(" %-6d %-6d\n", s.getCapacity(), s.getVolume());
            }
        }
        if (!found) System.out.println("Brand not available.");
    }

    public void buySedan() {
        if (sedan.isEmpty()) {
            System.out.println("There are no Sedans available.");
            return;
        }
        System.out.print("Enter brand: ");
        String brand = sc.nextLine();
        System.out.print("Enter model: ");
        String model = sc.nextLine();

        SEDAN target = null;
        for (SEDAN s : sedan) {
            if (s.getBrand().equalsIgnoreCase(brand) && s.getModel().equalsIgnoreCase(model)) {
                target = s;
                break;
            }
        }
        if (target == null) {
            System.out.println("No such Sedan found.");
            return;
        }

        System.out.print("Enter count to buy: ");
        int count;
        try {
            count = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Invalid number.");
            sc.nextLine();
            return;
        }

        if (count <= 0) {
            System.out.println("Invalid number.");
            return;
        }
        if (count > target.getStock()) {
            System.out.println("Not enough stock.");
            return;
        }
        double bill = count * target.getPrice();
        target.setStock(target.getStock() - count);
        System.out.println("Thank you! Your bill: Rs." + bill);
    }

    public void deleteSedan() {
        if (sedan.isEmpty()) {
            System.out.println("There are no Sedans available.");
            return;
        }
        System.out.print("Enter brand to delete: ");
        String brand = sc.nextLine();
        System.out.print("Enter model to delete: ");
        String model = sc.nextLine();

        Iterator<SEDAN> it = sedan.iterator();
        boolean found = false;
        while (it.hasNext()) {
            SEDAN s = it.next();
            if (s.getBrand().equalsIgnoreCase(brand) && s.getModel().equalsIgnoreCase(model)) {
                it.remove();
                found = true;
                System.out.println("Sedan deleted.");
                break;
            }
        }
        if (!found) System.out.println("No such Sedan available.");
    }

    public void UpdateSedan() {
        if (sedan.isEmpty()) {
            System.out.println("There are no Sedans available.");
            return;
        }
        System.out.print("Enter brand to update: ");
        String brand = sc.nextLine();
        System.out.print("Enter model to update: ");
        String model = sc.nextLine();

        SEDAN target = null;
        for (SEDAN s : sedan) {
            if (s.getBrand().equalsIgnoreCase(brand) && s.getModel().equalsIgnoreCase(model)) {
                target = s;
                break;
            }
        }
        if (target == null) {
            System.out.println("No such Sedan found.");
            return;
        }

        System.out.println("1. Update Stock\n2. Update Price");
        int choice;
        try {
            choice = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Invalid choice.");
            sc.nextLine();
            return;
        }

        switch (choice) {
            case 1 -> {
                System.out.print("Enter new stock: ");
                int stock = sc.nextInt();
                sc.nextLine();
                if (stock < 0) { System.out.println("Invalid number."); return; }
                target.setStock(stock);
                System.out.println("Stock updated.");
            }
            case 2 -> {
                System.out.print("Enter new price: ");
                double price = sc.nextDouble();
                sc.nextLine();
                if (price < 0) { System.out.println("Invalid number."); return; }
                target.setPrice(price);
                System.out.println("Price updated.");
            }
            default -> System.out.println("Invalid choice.");
        }
    }
}

class COUPE extends car {
    private static ArrayList<COUPE> coupe = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    private int volume; 
    private final int capacity = 2;

    public COUPE(String brand, String model, int stock, double price, int year, int volume) {
        super(brand, model, stock, price, year, (price < 5_000_000 ? "Normal" : "Luxury"));
        this.volume = volume;
    }

    public COUPE() {}

    public int getVolume() { return volume; }
    public int getCapacity() { return capacity; }

    public void addCoupe() {
        System.out.print("Enter number of Coupes to add: ");
        int n;
        try {
            n = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
            sc.nextLine();
            return;
        }

        for (int i = 0; i < n; i++) {
            try {
                System.out.print("Enter brand: ");
                String brand = sc.nextLine();
                System.out.print("Enter model: ");
                String model = sc.nextLine();
                System.out.print("Enter stock: ");
                int stock = sc.nextInt();
                System.out.print("Enter price: ");
                double price = sc.nextDouble();
                System.out.print("Enter year: ");
                int year = sc.nextInt();
                System.out.print("Enter cargo volume: ");
                int volume = sc.nextInt();
                sc.nextLine();

                if (stock < 0 || price < 0 || year <= 0 || volume < 0) {
                    System.out.println("Invalid values. Skipping entry.");
                    continue;
                }
                if (year <= 2010) {
                    System.out.println("Car is not eligible for sale (year <= 2010). Skipping.");
                    continue;
                }
                if (year > 2025) {
                    System.out.println("Car is yet to launch (year > 2025). Skipping.");
                    continue;
                }

                COUPE obj = new COUPE(brand, model, stock, price, year, volume);
                coupe.add(obj);
                System.out.println("Coupe added successfully.");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, skipping.");
                sc.nextLine();
            }
        }
    }

    public void dispalyCoupe() {
        if (coupe.isEmpty()) {
            System.out.println("There are no Coupes available.");
            return;
        }
        System.out.printf("%-12s %-12s %-6s %-8s %-12s %-10s %-8s %-6s\n",
                "BRAND", "MODEL", "YEAR", "STOCK", "PRICE(Rs)", "CATEGORY", "CAP", "VOL");
        for (COUPE c : coupe) {
            c.displayBase();
            System.out.printf(" %-6d %-6d\n", c.getCapacity(), c.getVolume());
        }
    }

    public void searchCoupe() {
        if (coupe.isEmpty()) {
            System.out.println("There are no Coupes available.");
            return;
        }
        System.out.print("Enter brand to search: ");
        String brand = sc.nextLine();
        boolean found = false;
        System.out.printf("%-12s %-12s %-6s %-8s %-12s %-10s %-8s %-6s\n",
                "BRAND", "MODEL", "YEAR", "STOCK", "PRICE(Rs)", "CATEGORY", "CAP", "VOL");
        for (COUPE c : coupe) {
            if (c.getBrand().equalsIgnoreCase(brand)) {
                found = true;
                c.displayBase();
                System.out.printf(" %-6d %-6d\n", c.getCapacity(), c.getVolume());
            }
        }
        if (!found) System.out.println("Brand not available.");
    }

    public void buyCoupe() {
        if (coupe.isEmpty()) {
            System.out.println("There are no Coupes available.");
            return;
        }
        System.out.print("Enter brand: ");
        String brand = sc.nextLine();
        System.out.print("Enter model: ");
        String model = sc.nextLine();

        COUPE target = null;
        for (COUPE c : coupe) {
            if (c.getBrand().equalsIgnoreCase(brand) && c.getModel().equalsIgnoreCase(model)) {
                target = c;
                break;
            }
        }
        if (target == null) {
            System.out.println("No such Coupe found.");
            return;
        }

        System.out.print("Enter count to buy: ");
        int count;
        try {
            count = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Invalid number.");
            sc.nextLine();
            return;
        }
        if (count <= 0) {
            System.out.println("Invalid number.");
            return;
        }
        if (count > target.getStock()) {
            System.out.println("Not enough stock.");
            return;
        }
        double bill = count * target.getPrice();
        target.setStock(target.getStock() - count);
        System.out.println("Thank you! Your bill: Rs." + bill);
    }

    public void deleteCoupe() {
        if (coupe.isEmpty()) {
            System.out.println("There are no Coupes available.");
            return;
        }
        System.out.print("Enter brand to delete: ");
        String brand = sc.nextLine();
        System.out.print("Enter model to delete: ");
        String model = sc.nextLine();

        Iterator<COUPE> it = coupe.iterator();
        boolean found = false;
        while (it.hasNext()) {
            COUPE c = it.next();
            if (c.getBrand().equalsIgnoreCase(brand) && c.getModel().equalsIgnoreCase(model)) {
                it.remove();
                found = true;
                System.out.println("Coupe deleted.");
                break;
            }
        }
        if (!found) System.out.println("No such Coupe available.");
    }

    public void UpdateCoupe() {
        if (coupe.isEmpty()) {
            System.out.println("There are no Coupes available.");
            return;
        }
        System.out.print("Enter brand to update: ");
        String brand = sc.nextLine();
        System.out.print("Enter model to update: ");
        String model = sc.nextLine();

        COUPE target = null;
        for (COUPE c : coupe) {
            if (c.getBrand().equalsIgnoreCase(brand) && c.getModel().equalsIgnoreCase(model)) {
                target = c;
                break;
            }
        }
        if (target == null) {
            System.out.println("No such Coupe found.");
            return;
        }

        System.out.println("1. Update Stock\n2. Update Price");
        int choice;
        try {
            choice = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Invalid choice.");
            sc.nextLine();
            return;
        }

        switch (choice) {
            case 1 -> {
                System.out.print("Enter new stock: ");
                int stock = sc.nextInt();
                sc.nextLine();
                if (stock < 0) { System.out.println("Invalid number."); return; }
                target.setStock(stock);
                System.out.println("Stock updated.");
            }
            case 2 -> {
                System.out.print("Enter new price: ");
                double price = sc.nextDouble();
                sc.nextLine();
                if (price < 0) { System.out.println("Invalid number."); return; }
                target.setPrice(price);
                System.out.println("Price updated.");
            }
            default -> System.out.println("Invalid choice.");
        }
    }
}

public class carshowroom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SUV suvManager = new SUV();
        SEDAN sedanManager = new SEDAN();
        COUPE coupeManager = new COUPE();

        int choice;
        do {
            System.out.println("\n==== CAR SHOWROOM ====");
            System.out.println("1. SUV");
            System.out.println("2. SEDAN");
            System.out.println("3. COUPE");
            System.out.println("4. Exit");
            System.out.print("Choice : ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    int Schoice;
                    do {
                        System.out.println("\n-- SUV MENU --");
                        System.out.println("1. ADD");
                        System.out.println("2. SEARCH");
                        System.out.println("3. UPDATE");
                        System.out.println("4. DELETE");
                        System.out.println("5. BUY");
                        System.out.println("6. DISPLAY");
                        System.out.println("7. BACK");
                        System.out.print("SChoice: ");
                        Schoice = sc.nextInt();
                        sc.nextLine();
                        

                        switch (Schoice) {
                            case 1 -> suvManager.addSUV();
                            case 2 -> suvManager.searchSUV();
                            case 3 -> suvManager.updateSUV();
                            case 4 -> suvManager.deleteSUV();
                            case 5 -> suvManager.buySUV();
                            case 6 -> suvManager.displaySUV();
                            case 7 -> System.out.println("Returning to main menu.");
                            default -> System.out.println("Invalid choice.");
                        }
                    } while (Schoice != 7);
                }

                case 2 -> {
                    int Sechoice;
                    do {
                        System.out.println("\n-- SEDAN MENU --");
                        System.out.println("1. ADD");
                        System.out.println("2. SEARCH");
                        System.out.println("3. UPDATE");
                        System.out.println("4. DELETE");
                        System.out.println("5. BUY");
                        System.out.println("6. DISPLAY");
                        System.out.println("7. BACK");
                        System.out.print("SeChoice: ");
                        Sechoice = sc.nextInt();
                        sc.nextLine();

                        switch (Sechoice) {
                            case 1 -> sedanManager.addSedan();
                            case 2 -> sedanManager.searchSEDAN();
                            case 3 -> sedanManager.UpdateSedan();
                            case 4 -> sedanManager.deleteSedan();
                            case 5 -> sedanManager.buySedan();
                            case 6 -> sedanManager.dispalySEDAN();
                            case 7 -> System.out.println("Returning to main menu.");
                            default -> System.out.println("Invalid choice.");
                        }
                    } while (Sechoice != 7);
                }

                case 3 -> {
                    int Cchoice;
                    do {
                        System.out.println("\n-- COUPE MENU --");
                        System.out.println("1. ADD");
                        System.out.println("2. SEARCH");
                        System.out.println("3. UPDATE");
                        System.out.println("4. DELETE");
                        System.out.println("5. BUY");
                        System.out.println("6. DISPLAY");
                        System.out.println("7. BACK");
                        System.out.print("CChoice: ");
                        Cchoice = sc.nextInt();
                        sc.nextLine();
                       
                        switch (Cchoice) {
                            case 1 -> coupeManager.addCoupe();
                            case 2 -> coupeManager.searchCoupe();
                            case 3 -> coupeManager.UpdateCoupe();
                            case 4 -> coupeManager.deleteCoupe();
                            case 5 -> coupeManager.buyCoupe();
                            case 6 -> coupeManager.dispalyCoupe();
                            case 7 -> System.out.println("Returning to main menu.");
                            default -> System.out.println("Invalid choice.");
                        }
                    } while (Cchoice != 7);
                }

                case 4 -> System.out.println("Thank you. Exiting...");
                default -> System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
