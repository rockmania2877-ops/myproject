import java.util.Scanner;

class Book {
    String author;
    String title;
    int price;
     
    void getDetails(Scanner sc, int i) {
        System.out.println("\nEnter the details of BookNo." + (i+1) + " : ");
        System.out.print("Title : ");
        title = sc.nextLine();
        System.out.print("Author : ");
        author = sc.nextLine();
        System.out.print("Price : ");
        price = sc.nextInt();
        sc.nextLine();
    }
    void displayBook() {
        System.out.println("\nTitle  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
    }
}
public class Bookstore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.of books : ");
        int n = sc.nextInt();
        sc.nextLine(); 
        
        Book[] books = new Book[n];
        for (int i = 0; i < n; i++) {
            books[i] = new Book();
            books[i].getDetails(sc, i);
        }
        System.out.println("\nBook Details\n");
        for (int i = 0; i < n; i++) {
            System.out.print("----Book "+(i+1)+"----");
            books[i].displayBook();
            System.out.println();
        }
        sc.close();
    }
}
