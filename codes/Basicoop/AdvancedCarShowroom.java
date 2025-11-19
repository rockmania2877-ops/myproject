package Basicoop;
import java.util.*;

class Car {
    private String brand;
    private String model;
    private double speed;
    private double rate;
    private int stock;
    private int count;

    public Car(String brand,String model,double speed,double rate,int stock){
        this.brand = brand;
        this.model = model;
        this.speed = speed;
        this.rate = rate;
        this.stock = stock;
        this.count = 0;
    }
        public String getBrand(){return brand;}
        public String getModel(){return model;}
        public double getSpeed(){return speed;}
        public double getRate(){return rate;}
        public int getStock(){return stock;}

        public void setSpeed(double speed){this.speed = speed;}
        public void setRate(double rate){this.rate = rate;}
        public void setStock(int stock){this.stock = stock;}
        public void addSales(int count){this.count = this.count + count;}
        
        public double getRevenue(){
            return rate * count;
        }
    public void display(){
        System.out.printf("%-10s %-10s %-19.2f %-15.2f %-6s\n",brand,model,speed,rate,stock);
    }    
}

class Showroom{
    private ArrayList<Car> cars = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public Showroom(Scanner sc) {this.sc = sc;}

    public void addCar(){
        System.out.print("Enter no.of Cars to be added : ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            try{
                System.out.println("----CAR INFO----");
                System.out.print("Enter the Brand : ");
                String brand = sc.nextLine();
                System.out.print("Enter Model name : ");
                String model = sc.nextLine();
                System.out.print("Enter the car's top Speed : ");
                double speed = sc.nextDouble();
                if(speed <= 0){
                   System.out.println("Invalid speed");
                   return;
                }
                System.out.print("Enter the car's Price : ");
                double rate = sc.nextDouble();
                 if(rate < 0){
                   System.out.println("Invalid price");
                   return;
                }
                System.out.print("Enter the Stock Available : ");
                int stock = sc.nextInt();
                 if(stock < 0){
                   System.out.println("Invalid Stock");
                   return;
                }
                sc.nextLine();

                cars.add(new Car(brand, model, speed, rate, stock));
                System.out.println("Cars added Successfully");
            }catch (InputMismatchException e){
                System.out.println("Invalid Input");
                sc.nextLine();
                i--;
            }
        }
    }
  
    public void display(){
        if(cars.isEmpty()){
            System.out.println("No cars available");
            return;
        }
        System.out.println("------CAR DATA------");
        System.out.printf("%-10s %-10s %-19s %-15s %-6s\n","BRAND","MODEL","TOP_SPEED(Km/hr)","PRICE(Rs)","STOCK");
        for(Car i : cars){
            i.display();
        }
    }

    public void UpdateCar(){
         if(cars.isEmpty()){
            System.out.println("No cars available");
            return;
        }
        System.out.println("Enter Brand & Model to update : ");
        String brand= sc.nextLine();
        String model = sc.nextLine();
        for(Car i:cars){
        if(i.getBrand().equalsIgnoreCase(brand) && i.getModel().equalsIgnoreCase(model)){
        System.out.println("Enter a choice to Update : ");
        System.out.println("1.Top speed\n2.Price\n3.stock availability");
        System.out.print("CHOICE : ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
            System.out.print("Enter New Top speed : ");
            double speed = sc.nextDouble();
            i.setSpeed(speed);
            break;

            case 2:
            System.out.print("Enter Updated price : ");
            double price = sc.nextDouble();
            i.setRate(price);
            break;

            case 3:
            System.out.print("Enter Updated Stock : ");
            int stock = sc.nextInt();
            i.setStock(stock);
            break;

            default:
            System.out.println("Invalid Choice");
            break;
        }
        return;
         }
         }System.out.println("Car not Available");
    }

    public void sales(){
        if(cars.isEmpty()){
            System.out.println("No cars available");
            return;
        }
        System.out.print("Enter Brand & Model to update : ");
        String brand= sc.nextLine();
        String model = sc.nextLine();
        for(Car i:cars){
        if(i.getBrand().equalsIgnoreCase(brand) && i.getModel().equalsIgnoreCase(model)){
            System.out.print("Stock Remaining : "+i.getStock());
            System.out.print("Enter How many Cars : ");
            int count = sc.nextInt();
            if (count <= 0) {
                   System.out.println("Invalid quantity.");
                   return;
               }
               if (count > i.getStock()) {
                   System.out.println("Not enough stock available!");
                   return;
               }
            double total = count * i.getRate();
            i.setStock(i.getStock()-count);
            i.addSales(count);

            System.out.println("Sales Successfull");
            System.out.println("Your Bill : Rs."+total);
            System.out.println("Remaining Stock : "+i.getStock());
            }
         }System.out.println("Car not available");
    }
    
    public void search(){ 
        if(cars.isEmpty()){
            System.out.println("No cars available");
            return;
        }
        System.out.print("Enter Brand & Model to display : ");
        String brand= sc.nextLine();
        String model = sc.nextLine();
        for(Car i:cars){
        if(i.getBrand().equalsIgnoreCase(brand) && i.getModel().equalsIgnoreCase(model)){
                System.out.printf("%-10s %-10s %-19s %-15s %-6s\n","BRAND","MODEL","TOP_SPEED(Km/hr)","PRICE(Rs)","STOCK");
                i.display();
                return;
        }
       }System.out.println("Car not found.");
    }

    public void delete() {
         if(cars.isEmpty()){
            System.out.println("No cars available");
            return;
        }
        System.out.println("Enter Brand & Model to delete : ");
        String brand= sc.nextLine();
        String model = sc.nextLine();
        
        Iterator<Car> it = cars.iterator();
        while (it.hasNext()) {
            Car i = it.next();
             if(i.getBrand().equalsIgnoreCase(brand) && i.getModel().equalsIgnoreCase(model)) {
                it.remove();
                System.out.println("Car deleted successfully.");
                return;
            }
        }System.out.println("Car not found.");
    }
    
    public void test(){
        if(cars.isEmpty()){
            System.out.println("No cars available for test drive");
            return;
        }
        System.out.print("Enter Brand & Model to Test drive : ");
        String brand= sc.nextLine();
        String model = sc.nextLine();
        for(Car i:cars){
        if(i.getBrand().equalsIgnoreCase(brand) && i.getModel().equalsIgnoreCase(model)){
            System.out.println(""+i.getBrand()+" "+i.getModel()+" is Assigned for a test drive.");
            return;
        }
        }System.out.println("Car not available");
    }

    public void revenue(){
        if(cars.isEmpty()){
            System.out.println("No cars available");
            return;
        }
        System.out.print("Enter Brand & Model : ");
        String brand= sc.nextLine();
        String model = sc.nextLine();
        for(Car i:cars){
        if(i.getBrand().equalsIgnoreCase(brand) && i.getModel().equalsIgnoreCase(model)){
            System.out.println("Total revenue by "+i.getBrand()+" "+i.getModel()+" is Rs."+i.getRevenue());
            return;
        }
        }System.out.println("Car not found");
    }

    public void totalRevenue(){
         if(cars.isEmpty()){
            System.out.println("No cars available");
            return;
        }
        double income = 0;
        for(Car i:cars){
          income = income + i.getRevenue();
        }
        System.out.println("Total Income by Car sales : "+income);

    }
}

public class AdvancedCarShowroom{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom benz = new Showroom(sc);

        int choice;
        System.out.println(" Welcome to Mercedes-Benz");

        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Add New Car");
            System.out.println("2. Display All Models");
            System.out.println("3. Search a Car");
            System.out.println("4. Update a car");
            System.out.println("5. Delete a car");
            System.out.println("6. Buy a car");
            System.out.println("7.Test Drive");
            System.out.println("8.Revenue by a car");
            System.out.println("9.Total Revenue");
            System.out.println("10.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> benz.addCar();
                case 2 -> benz.display();
                case 3 -> benz.search();
                case 4 -> benz.UpdateCar();
                case 5 -> benz.delete();
                case 6 -> benz.sales();
                case 7 -> benz.test();
                case 8 -> benz.revenue();
                case 9 -> benz.totalRevenue();
                case 10-> System.out.println(" Thank you! Visit again.");
                default -> System.out.println(" Invalid choice. Please try again.");
            }
        } while (choice != 10);
        sc.close();
    }
}
