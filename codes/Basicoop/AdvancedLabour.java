package Basicoop;
import java.util.*;

class Employee{
    private String name;
    private int id;
    private int years;
    private int age;
    private double salary;

 public Employee(String name,int id,int years,int age,double salary){
    this.name = name;
    this.id = id;
    this.years = years;
    this.age = age;
    this.salary = salary;
 }
 
 public int getId(){return id;}
 public String getName(){return name;}
 public int getyears(){return years;}
 public int getAge(){return age;}
 public double getSalary(){return salary;}
 
 public void setyears(int years){this.years=years;}
 public void setAge(int age){this.age=age;}
 public void setSalary(double salary){this.salary=salary;}

 public void display(){
    System.out.printf("%-5s %-15s %-8d %-8d %-10.2f\n",id,name,years,age,salary);
 }
 }

class Company{
    private ArrayList<Employee> employee = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addEmployee(){
        System.out.print("Enter the no.of Employees : ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            try{
            System.out.println("---Employee Info---");
            System.out.print("Enter name:");
            String name = sc.nextLine();
            System.out.print("Enter id : ");
            int id = sc.nextInt();
            System.out.print("Enter the years of Experience : ");
            int years = sc.nextInt();
            System.out.print("Enter Age : ");
            int age = sc.nextInt();
            System.out.print("Enter Salary : ");
            double salary = sc.nextDouble();
            sc.nextLine();

            employee.add(new Employee(name,id,years,age,salary));
            System.out.println("Employee Added Successfully.");
            }catch (InputMismatchException e) {
                System.out.println("Invalid Input!");
            }
        }
    }

    public void search(){
        System.out.print("Enter the ID to search : ");
        int id = sc.nextInt();
        sc.nextLine();
        boolean found = false;
        for(Employee i : employee){
            if(i.getId()==id){
                System.out.printf("%-5s %-15s %-8s %-8s %-10.2s","kID","Name","Years","Age","Salary");
                i.display();
                found = true;
                break;
            }
        }
        if(!found) System.out.println("Employee Not found.");
        }

    public void updateEmployee(){
        System.out.print("Enter the Employee ID to update : ");
        int id = sc.nextInt();
        sc.nextLine();
        boolean found = false;
        for(Employee i : employee){
            if(i.getId()==id){
                System.out.println("Enter a choice to update");
                System.out.println("1.Years of Experience \n2.Age \n3.Salary");
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice){
                    case 1:
                    System.out.print("Enter Updated Years of Experience : ");
                    int years = sc.nextInt();
                    i.setyears(years);
                    break;

                    case 2:
                    System.out.print("Enter Updated Age : ");
                    int age = sc.nextInt();
                    i.setAge(age);
                    break;

                    case 3:
                    System.out.print("Enter updated Salary : ");
                    double salary = sc.nextDouble();
                    i.setSalary(salary);
                    break;

                    default :
                    System.out.println("Invalid Choice");
                }
                found = true;
                System.out.println("Information Updated Successfully!");
                break;
            }
        }
        if(!found) System.out.println("Empployee not found.");
        }

    public void display(){
        if(employee.isEmpty()){
            System.out.println("No Employees are Working");
            return;
        }
        System.out.println("====Employees List====");
         System.out.printf("%-5s %-15s %-8s %-8s %-10s","ID","Name","Years","Age","Salary\n");
        for(Employee i : employee){
          i.display();
        }
       }

    public void delete(){
        System.out.print("Enter Employee ID to delete : ");
        int id = sc.nextInt();
        Iterator<Employee> it = employee.iterator();
        boolean found = false;

        while(it.hasNext()){
            Employee emp = it.next();
            if(emp.getId()==id){
                it.remove();
                System.out.println("Employee is fired!");
                found = true;
                break;
            }
        }if(!found) System.out.println("Employee not found");
       }
    }

public class AdvancedLabour {
    public static void main(String[]args){
        Company comp = new Company();
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do{
            System.out.println("====Enter a choice====");
            System.out.println("1.Add New Employees");
            System.out.println("2.Display All Employees");
            System.out.println("3.Display an Specific Employee");
            System.out.println("4.Update an Employee");
            System.out.println("5.Delete an Employee");
            System.out.println("6.Exit");
            System.out.print("Choice : ");
            choice = sc.nextInt();

            switch (choice){
                case 1 -> comp.addEmployee();
                case 2 -> comp.display();
                case 3 -> comp.search();
                case 4 -> comp.updateEmployee();
                case 5 -> comp.delete();
                case 6 -> System.out.println("Exited Thank you");
                default -> System.out.println("Invalid Choice");
    }
}while(choice != 6);
sc.close();
    }
}