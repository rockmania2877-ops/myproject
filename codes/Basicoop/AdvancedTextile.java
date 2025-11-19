package Basicoop;
import java.util.*;

class Dress{
    private String name;
    private String type;
    private String color;
    private double price;
    private int stock;
    private int count;

    public Dress(String name,String type,String color,double price,int stock){
        this.name = name;
        this.type = type;
        this.color = color;
        this.price = price;
        this.stock = stock;
        this.count = 0;
    }
    public String getName(){return name;}
    public String getType(){return type;}
    public String getColor(){return color;}
    public double getPrice(){return price;}
    public int getStock(){return stock;}

    public void setPrice(double price){this.price=price;}
    public void setStock(int stock){this.stock=stock;}
    public void addSales(int count){this.count += count;}

    public double getAmount(){
        return price * count;
    }
    public void display(){
        System.out.printf("%-10s %-10s %-10s %-10.2f %-5d",name,type,color,price,stock);
    }
}

class Textile{
    private ArrayList<Dress> dresses = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    
    public Textile(Scanner sc){this.sc = sc;}

    public void addDress(){
        System.out.print("Enter No.of dress to be addded: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            try{
            System.out.print("Enter the Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Cloth type: ");
            String type = sc.nextLine();
            System.out.print("Enter the Colour: ");
            String color = sc.nextLine();
            System.out.print("Enter the price: ");
            double price = sc.nextDouble();
            if(price<=0){System.out.println("Invalid price");return;}
            System.out.print("Enter the stock availability: ");
            int stock = sc.nextInt();
            if(stock<=0){System.out.println("Invalid stock number");return;}
            sc.nextLine();

            dresses.add(new Dress(name,type,color,price,stock));
            System.out.println("Dress added Sucessfully.");
            }
            catch (InputMismatchException e){
                System.out.println("Invalid input");
                sc.nextLine();
                i--;
            }
        }
        return;
    }

    public void display(){
        System.out.println("-----DRESS LIST-----");
        System.out.printf("%-10s %-10s %-10s %-10s %-5s","NAME","CLOTH","COLOUR","PRICE","STOCK\n");
        for(Dress i:dresses){
            i.display();
            System.out.println();
        }
    }

    public void search(){
        if(dresses.isEmpty()) {System.out.println("No dresses available in the store."); return;}
        System.out.print("Enter the name :");
        String name = sc.nextLine();
        boolean found = false;
        for(Dress i:dresses){
            System.out.printf("%-10s %-10s %-10s %-10s %-5s","NAME","CLOTH","COLOUR","PRICE","STOCK\n");
            if(i.getName().equalsIgnoreCase(name)){
                i.display();
                System.out.println();
                found = true;
            }if(!found){
                System.out.println("NO such dresses Available.");
                return;
            }
        } 
    }

    public void update(){
      if(dresses.isEmpty()) {System.out.println("No dresses available."); return;}
      System.out.print("Enter the name and cloth of the dress:");
      String name = sc.nextLine();  
      String type = sc.nextLine();
      System.out.print("Enter the colour : ");
      String color = sc.nextLine(); 
      boolean found = false;
        for(Dress i:dresses){
        if(i.getName().equalsIgnoreCase(name) && i.getType().equalsIgnoreCase(type)&&i.getColor().equalsIgnoreCase(color)){
            found = true;
            System.out.println("1.Price\n2.Stock");
            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                System.out.print("Enter new price: ");
                double price = sc.nextDouble();
                if(price<=0){System.out.println("Invalid price"); return;}
                i.setPrice(price);
                break;

                case 2:
                System.out.print("Enter updated stock: ");
                int stock = sc.nextInt();
                if(stock<=0){System.out.println("Invalid stock"); return;}
                i.setStock(stock);
                break;

                default:
                System.out.println("Invalid choice.");
                break;
            }

                System.out.println("Textiles updated!");
                return;
        }if(!found)System.out.println("No such dresses available");
        }
    }

    public void sale(){
      if(dresses.isEmpty()) {System.out.println("No dresses available."); return;}
      double bill=0;
       while(true){
          System.out.println("1.Buy\n2.Stop");
          int choice = sc.nextInt();
          sc.nextLine();
          if(choice==2) break;
          System.out.print("Enter the name and cloth of the dress:");
          String name = sc.nextLine();  
          String type = sc.nextLine();
          System.out.print("Enter the colour: ");
          String color = sc.nextLine();
          boolean found = false;
            for(Dress i:dresses){
            if(i.getName().equalsIgnoreCase(name) && i.getType().equalsIgnoreCase(type)&&i.getColor().equalsIgnoreCase(color)){
                found = true;
                System.out.print("Enter how many? ");
                int count = sc.nextInt();
                sc.nextLine();
                if(count<=0){System.out.print("Invalid stock"); return;}
                if(count>i.getStock()){System.out.println("No such stock available"); return;}
                double pp = count * i.getPrice();
                bill = bill +pp;
                i.setStock(i.getStock()-count);
                i.addSales(count);
            }
            }if(!found)System.out.println("Dress model not found.");
        }
        System.out.println("Thank you for shopping.");
        System.out.println("Your TotalBill : Rs."+bill);
        return;
    }

    public void delete(){
        if(dresses.isEmpty()) {System.out.println("No dresses available."); return;}
        System.out.print("Enter the name and model: ");
        String name = sc.next();
        String type = sc.nextLine();
        System.out.print("Enter color: ");
        String color = sc.nextLine();
        boolean found = true;
        Iterator<Dress> it = dresses.iterator();
        while(it.hasNext()){
            Dress i = it.next();
            if(i.getName().equalsIgnoreCase(name) && i.getType().equalsIgnoreCase(type)&&i.getColor().equalsIgnoreCase(color)){
                found = true;
                it.remove();
                System.out.println("Dress removed Successfully");
                return;
            }
        }if(!found)System.out.println("Dress not available already.");
        return;
    }

    public void Overallrevenue(){
        if(dresses.isEmpty()) {System.out.println("No Sales Today."); return;}
        double revenue = 0;
        for(Dress i:dresses){
            revenue = revenue + i.getAmount();
        }
        System.out.println("Total income today: Rs"+revenue);
        return;
    }

    public void InvRevenue(){
        if(dresses.isEmpty()) {System.out.println("No Sales Today."); return;}
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        double revenue = 0;
        for(Dress i:dresses){
            if(i.getName().equals(name)){
                if(i.getStock()>0){
                    System.out.println("No sales of "+name+" today");
                }
                 revenue = revenue + i.getAmount();
            }
        }
        System.out.println("Total income by "+name+" is Rs."+revenue);
        return;
    }
}

public class AdvancedTextile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Textile silk = new Textile(sc);

        int choice;
        do{
            System.out.println("\n==== MENU ====");
            System.out.println("1. Add Dress");
            System.out.println("2. Display All dress");
            System.out.println("3. Search a dress");
            System.out.println("4. Update a dress");
            System.out.println("5. Delete a dress");
            System.out.println("6. Buy a dress");
            System.out.println("7.Revenue by a dress");
            System.out.println("8.Total Revenue");
            System.out.println("9.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1 : silk.addDress(); break;
                case 2 : silk.display();  break;
                case 3 : silk.search();   break;
                case 4 : silk.update(); break;
                case 5 : silk.delete(); break;
                case 6 : silk.sale();break;
                case 7 : silk.InvRevenue();break;
                case 8 : silk.Overallrevenue();break;
                case 9 : System.out.println("ThankYou Come again.");break;
                default: System.out.println("Invalid choice"); break;
            }
        }while (choice != 9);
    }
}
