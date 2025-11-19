package classes;
import java.util.Scanner;

class car{
    String name;
    int year;
    int cost;

void getDetails(Scanner sc,int i){
    System.out.println("\nEnter the Details of car"+(i+1));
    System.out.print("Enter the Model Name : ");
    name = sc.nextLine();
    System.out.print("What is the Production year? ");
    year = sc.nextInt();
    System.out.print("What is the cost of the car : ");
    cost = sc.nextInt();
    sc.nextLine();
}
void displayCar(){
    System.out.println("Model Name : "+name);
    System.out.println("Production Year : "+year);
    System.out.println("Cost : "+cost);
}
}
public class CarShowRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total no.of cars : ");
        int n = sc.nextInt();
        sc.nextLine();

        car[] cars = new car[n];
        for(int i=0;i<n;i++){
            cars[i] = new car();
            cars[i].getDetails(sc,i);
        }
        System.out.print("----Cars List----");
        for(int i=0;i<n;i++){
            System.out.println("\nCar "+1);
            cars[i].displayCar();
            System.out.println();
        }
        sc.close();
    }
    
}
