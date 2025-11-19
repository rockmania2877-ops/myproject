package classes;
import java.util.Scanner;

class Employeee{
    String name;
    int id;
    double bp,hra,da,gs;

void getDetails(Scanner sc,int i) 
{
    System.out.println("--- Enter the Details of Employee "+(i+1)+" ---");
    System.out.print("Name : ");
    name = sc.nextLine();
    System.out.print("Employee ID : ");
    id = sc.nextInt();
    System.out.print("Basic Pay : ");
    bp = sc.nextDouble();
    sc.nextLine();
}

void calc(double da){
    gs = bp + (bp*(hra/100)) + (bp*(da/100));
}
void Display(int i){
    System.out.println("---- Employee "+(i+1)+" ----");
    System.out.println("Name : "+name);
    System.out.println("ID : "+id);
    System.out.println("Basic Pay : "+bp);
    System.out.println("Gross Salary : "+gs);
}
}
public class Employer {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No.of Employees : ");
        int n = sc.nextInt();
        sc.nextLine();
        
        Employeee[] emp = new Employeee[n];
        
        System.out.print("Enter the Common DA for all Empoyees : ");
        double da = sc.nextDouble();
        sc.nextLine();

        for(int i=0;i<n;i++){
            emp[i] = new Employeee();
            emp[i].getDetails(sc, i);
            System.out.print("Enter the HRA of the employee : ");
            emp[i].hra = sc.nextDouble();
            sc.nextLine();
        }
       
       for(int i=0;i<n;i++){
        emp[i].calc(da);
       }
       for(int i=0;i<n;i++){
        emp[i].Display(i);
       }
       double max = 0;
       String rich = "";
       for(int i=0;i<n;i++){
        if(emp[i].gs > max)
        {
            max = emp[i].gs;
            rich = emp[i].name;
        }
       }
       System.out.println("Employee With most Salary is "+rich);
       sc.close();
    }
}