import java.util.Scanner;

class Item {
    int id;
    String name;
    double rate;
    int quantity;

    void getDetails(Scanner sc, int i) {
        System.out.println("---- Enter the Details of Product " + (i + 1) + " ----");
        System.out.print("Name : ");
        name = sc.nextLine();
        System.out.print("Product ID : ");
        id = sc.nextInt();
        System.out.print("Rate : ");
        rate = sc.nextDouble();
        System.out.print("Quantity Available : ");
        quantity = sc.nextInt();
        sc.nextLine();
    }

    void display(int i) {
        System.out.println("\n---- Information of the Product " + (i + 1) + " ----");
        System.out.println("Name of the Product : " + name);
        System.out.println("Product ID : " + id);
        System.out.println("Rate of the Product : " + rate);
        System.out.println("Quantity Available : " + quantity);
    }
}

public class Inventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Products : ");
        int n = sc.nextInt();
        sc.nextLine();

        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            items[i] = new Item();
            items[i].getDetails(sc, i);
        }

        System.out.println("\n=== PRODUCT LIST ===");
        for (int i = 0; i < n; i++) {
            items[i].display(i);
        }

        System.out.print("\nDo you want to buy something? (1 for Yes / 0 for No): ");
        int choice = sc.nextInt();
        sc.nextLine();

        double totalBill = 0;

        if (choice == 1) {
            System.out.print("Enter the number of different products you want to buy: ");
            int m = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < m; i++) {
                System.out.print("\nEnter the name of product " + (i + 1) + ": ");
                String buyName = sc.nextLine();

                boolean found = false;
                for (Item item : items) {
                    if (item.name.equalsIgnoreCase(buyName)) {
                        found = true;
                        System.out.print("Enter quantity to buy: ");
                        int buyQty = sc.nextInt();
                        sc.nextLine();

                        if (buyQty <= item.quantity) {
                            double price = buyQty * item.rate;
                            totalBill += price;
                            item.quantity -= buyQty; 
                            System.out.println("Added to bill: Rs. " + price);
                        } else {
                            System.out.println("Stock not available!");
                        }
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Product not found!");
                }
            }
        }

        System.out.println("\nThank you for shopping!");
        System.out.println("Your total bill: Rs. " + totalBill);
        sc.close();
    }
}
