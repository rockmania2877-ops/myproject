package classes;
import java.util.Scanner;

class Electricity{
    String name;
    int id;
    double units;
    double price;

void getDetails(Scanner sc,int i){
    System.out.println("----Enter the following Details for Employee "+(i+1)+" ----");
    System.out.print("Name : ");
    name = sc.nextLine();
    System.out.print("ID : ");
    id = sc.nextInt();
    System.out.print("No.of Units Used : ");
    units = sc.nextDouble();
    sc.nextLine();
}
void calc(int i){
    if(units < 100){
        price = 240;
    }
    else if(100 < units && units< 200){
        price = (units-100) * 2.40;
    }
    else if(200 < units && units < 400){
        price = (units-100) * 3;
    }
    else{
        price = (units-100) * 6.40;
    }
}
void display(int i){
    System.out.println("\n----Bill of the Consumer"+(i+1)+" ----");
    System.out.println("Consumer Name : "+name);
    System.out.println("Connection ID : "+id);
    System.out.println("Electricity Bill : Rs."+price);
}
}
public class current {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the No.of Consumers : ");
        int n = sc.nextInt();
        sc.nextLine();

        Electricity[] elec = new Electricity[n];

        for(int i=0;i<n;i++){
            elec[i] = new Electricity();
            elec[i].getDetails(sc, i);
        }
        for(int i=0;i<n;i++){
            elec[i].calc(i);
        }
        for(int i=0;i<n;i++){
            elec[i].display(i);
        }
        double max = 0;
        String more = "";
        for(int i=0;i<n;i++){
            if(elec[i].price > max){
                max = elec[i].price;
                more = elec[i].name;
            }
        }
        System.out.println("The Consumer with most electricity bill is "+more+" with the bill Rs."+max);
        sc.close();
    }
}
