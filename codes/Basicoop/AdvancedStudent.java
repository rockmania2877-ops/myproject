package Basicoop;
import java.util.*;

class Student{
    private String name;
    private int rollno;
    private String sex;
    private int age;

    public Student(String name,int rollno,String sex,int age){
        this.name = name;
        this.rollno = rollno;
        this.sex = sex;
        this.age = age;
    }
    public String getName(){return name;}
    public int getRollno() {return rollno;}
    public String getSex(){return sex;}
    public int getAge(){return age;}

    public void setName(String name){this.name = name;}
    public void setAge(int age){this.age = age;}
    public void setSex(String sex){this.sex = sex;}

    public void display(){
        System.out.printf("%-5s %-18s %-5s %-5s\n",rollno,name,sex,age);
    }
}

class Classroom{
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addStudent(){
        try{
        System.out.print("Enter name : ");
        String name = sc.nextLine();
        System.out.print("Enter RollNumber : ");
        int rollno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Sex : ");
        String sex = sc.nextLine();
        System.out.print("Enter age : ");
        int age = sc.nextInt();
        sc.nextLine();

        students.add(new Student(name,rollno,sex,age));
        System.out.println("Student added Successfully");
     }catch (InputMismatchException e){
        System.out.println("Invalid! Input");
        sc.nextLine();
    }

    }

    public void displayStudents(){
        if(students.isEmpty()){
            System.out.println("Students yet to be added");
        }
        System.out.println("----XII-A2 STUDENTS LIST----");
        System.out.printf("%-5s %-15s %-5s %-5s\n","Rollno","Name","Sex","Age");
        for(Student i : students){
            i.display();
        }
    }

    public void updateStudent(){
        System.out.print("Enter the Rollnumber to Search : ");
        int rollno = sc.nextInt();
        boolean found = false;
        for(Student i:students){
            if(i.getRollno()==rollno){
                System.out.print("Enter correct name : ");
                String name = sc.nextLine();
                System.out.print("Enter the correct age : ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter the correct Sex : ");
                String sex = sc.nextLine();
                i.setAge(age);
                i.setName(name);
                i.setSex(sex);
                System.out.println("Student Updated.");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Student Not found.");
        }
    }

    public void search(){
        System.out.print("Enter the Rollnumber : ");
        int rollno = sc.nextInt();
        sc.nextLine();
        boolean found = false;
        for(Student i:students){
            if(i.getRollno()==rollno){
                System.out.println("\n---STUDENT DETAILS---");
                System.out.printf("%-5s %-15s %-5s %-5s","RollNO","Name","Sex","Age");
                i.display();
                found = true;
                break;
            }
        }if(!found){
            System.out.println("Student Not found");
        }
    }

    public void deleteStudent(){
        System.out.print("Enter the Rollnumber : ");
        int rollno = sc.nextInt();
        Iterator<Student> stu = students.iterator();
        boolean found = false;
       while(stu.hasNext()){
         Student stud = stu.next();
         if(stud.getRollno()==rollno){
              stu.remove();
              System.out.println("Student Removed from the class");
              found = true;
              break;
         }
       }if(!found){
        System.out.println("Student Not found");
       }
    }
}

public class AdvancedStudent {
    public static void main(String[] args) {
        Classroom a = new Classroom();
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("----Welcome to XII-A2----");
            System.out.println("1.Add student");
            System.out.println("2.Search Student");
            System.out.println("3.Display all information");
            System.out.println("4.Update Student");
            System.out.println("5.Delete student");
            System.out.print("CHOICE : ");
            choice = sc.nextInt();

        switch (choice){
            case 1 -> a.addStudent();
            case 2 -> a.search();
            case 3 -> a.displayStudents();
            case 4 -> a.updateStudent();
            case 5 -> a.deleteStudent();
            case 0 -> System.out.println("Exiting Thank YOU");
            default -> System.out.println("Invalid choice");
        }   
        }while(choice!=0);
    sc.close();
    }
}
