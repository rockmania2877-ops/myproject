import java.util.Scanner;

class Car{
    String brand;            
    String model;
    double speed;
    double time;
    double acceleration;
    double Final;
    int choice;

void getDetails(Scanner sc,int i){
    System.out.println("===--Details of the Car "+(i+1)+" --===");
    System.out.print("Brand : ");
    brand = sc.nextLine();
    System.out.print("Model : ");
    model = sc.nextLine();
    System.out.print("Speed that the car is going (in km): ");
    speed = sc.nextDouble();
}
void change(Scanner sc,int i){
    System.out.print("Acceralation-1 (or) Deceralation-2 : ");
    choice = sc.nextInt();
    System.out.print("Acceleration(or)Deceleration of the car : ");
    acceleration = sc.nextDouble();
    System.out.print("Time interval of Acceleration (or) Deceleration (in hr) : ");
    time = sc.nextDouble();
    sc.nextLine();
}
void process(int i){
    if(choice==1){
    Final = (speed) + (acceleration*time);
 }
else{
    Final = (speed) - (acceleration*time);
}
}
void display(int i){
    System.out.println((i+1)+"."+brand+" "+model+" Which was going at a speed of "+speed+" km/hr is now going at a speed of "+Final+" km/hr.");
}
}
public class CarInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total No.of cars : ");
        int n = sc.nextInt();
        sc.nextLine();

        Car[] cars = new Car[n];

        for(int i=0;i<n;i++){
            cars[i] = new Car();
            cars[i].getDetails(sc, i);
            cars[i].change(sc, i);
            cars[i].process(i);
        }
        for(int i=0;i<n;i++){
            cars[i].display(i);
        }
        sc.close();
    }
}