import java.util.Scanner;

class Employee{
    String name;
    double salary;
    double percent;
    double increment;
    double Final;

void getDetails(Scanner sc,int i){
        System.out.println("--- Enter the Details of Employee "+(i+1)+" ---");
        System.out.print("Name of the employee : ");
        name = sc.nextLine();
        System.out.print("His Salary : ");
        salary = sc.nextDouble();
        System.out.print("Increment Percentage : ");
        percent = sc.nextDouble();
        sc.nextLine();
}
void Process(int i){
    increment = (salary) * (percent / 100);
    Final = increment + salary;
}
void Display(int i){
    System.out.println("\n=== Information of the Employee "+(i+1)+" ===");
    System.out.println("Name : "+name);
    System.out.println("Inital Salary : "+salary);
    System.out.println("Increment Percentage : "+percent);
    System.out.println("Increment Amount : "+increment);
    System.out.println("Final Salary : "+Final);
}
}
public class employeeInfo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No.of Employees : ");
        int n = sc.nextInt();
        sc.nextLine();
        
        Employee[] emp = new Employee[n];

        for(int i=0;i<n;i++){
            emp[i] = new Employee();
            emp[i].getDetails(sc, i);
            emp[i].Process(i);
        }
        for(int i=0;i<n;i++){
            emp[i].Display(i);
        }
        sc.close();
    }
}