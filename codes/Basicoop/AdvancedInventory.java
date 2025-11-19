package Basicoop;
import java.util.*;

class Item{
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Item(int id,String name,double price,int quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public int getId(){ return id;}
    public String getName() { return name;}
    public double getprice() {return price;}
    public double getQuantity() {return quantity;}

    public void setPrice(double price) {this.price = price;}
    public void setQuantity(int quantity) {this.quantity = quantity;}

    public double getTotalvalue(){
        return price*quantity;
    }
    public void display(){
        System.out.printf("%-5d %-15s %-10.2f %-10d %-10.2f\n",id,name,price,quantity,getTotalvalue());
    }
}

class Inventory{
    private ArrayList<Item> items = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addItem(){
        try{
            System.out.print("Enter Item ID : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Item Name : ");
            String name = sc.nextLine();
            System.out.print("Enter Item price : ");
            double price = sc.nextDouble();
            System.out.print("Enter Quantity : ");
            int qty = sc.nextInt();

            items.add(new Item(id,name,price,qty));
            System.out.println("Item added Successfully!");
        } catch (InputMismatchException e){
            System.out.println("Invalid Input! Pleasae enter a valid Input");
            sc.nextLine();
        }
    }
    public void displayItems(){
        if(items.isEmpty()){
            System.out.println("No items in the Inventory");
            return ;
        }
        System.out.println("Inventory List");
        System.out.printf("%-5s %-15s %-10s %-10s %-10s\n","ID","Name","Price","Qty","Value");
        for(Item i : items){
            i.display();
        }
    }
    public void searchItem(){
        System.out.print("Enter item name to Search : ");
        sc.nextLine();
        String name = sc.nextLine();
        boolean found = false;
        for(Item i:items){
            if(i.getName().equalsIgnoreCase(name)){
                System.out.println("Item Found!");
                System.out.printf("%-5s %-15s %-10s %-10s\n","ID","Name","Price","Qty","Value");
                i.display();
                found = true;
                break;
            }
        }
        if(!found)
        System.out.println("Item Not found");
        }
    public void deleteItem(){
        System.out.print("Enter Item ID to delete : ");
        int id = sc.nextInt();
        Iterator<Item> it = items.iterator();
        boolean found = false;

        while(it.hasNext()){
           Item i = it.next();
            if(i.getId()==id){
                it.remove();
               System.out.println("Item Deleted Successfully");
               found = true;
                break;
                }
            }
            if(!found)
            System.out.println("Item not found");
        }
    public void updateItem(){
        System.out.print("Enter item ID to update: ");
        int id = sc.nextInt();
        boolean found = false;
        for(Item i : items){
            if(i.getId()==id){
                System.out.print("Enter the new price : ");
                double price = sc.nextDouble();
                System.out.print("Enter New quantity : ");
                int qty = sc.nextInt();
                i.setPrice(price);
                i.setQuantity(qty);
                System.out.println("Item updated Successfully!");
                found = true;
                break;
            }
        }
        if(!found)
        System.out.println("Item not found!");
        }
    public void totalInventoryValue(){
        double total = 0;
        for (Item i : items)
        total = total + i.getTotalvalue();

        System.out.printf("Total Inventory Value : Rs.%.2f\n",total);
    }
}

public class AdvancedInventory {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("\n====Inventory Management System====");
            System.out.println("1.Add Item");
            System.out.println("2.Display All items");
            System.out.println("3.Search by name");
            System.out.println("4.Update Item");
            System.out.println("5.Delete Item");
            System.out.println("6.Total Inventory value");
            System.out.println("0.Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice){
                case 1 -> inv.addItem();
                case 2 -> inv.displayItems();
                case 3 -> inv.searchItem();
                case 4 -> inv.updateItem();
                case 5 -> inv.deleteItem();
                case 6 -> inv.totalInventoryValue();
                case 0 -> System.out.println("Exiting...Thnank You!");
                default -> System.out.println("Invalid Choice!");
            }
        }while (choice !=0);
        sc.close();
    }
}
