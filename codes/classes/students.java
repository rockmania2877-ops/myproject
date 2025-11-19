import java.util.Scanner;

class Student{
    String name;
    int rollno;
    int age;

void getDetails(Scanner sc,int i){
    System.out.print("---Student "+(i+1)+"----");
    System.out.print("\nName : ");
    sc.nextLine();
    name = sc.nextLine();
    System.out.print("Rollnumber : ");
    rollno = sc.nextInt();
    System.out.print("Age : ");
    age = sc.nextInt();
}
void Display(int i){
    System.out.println("----Details of Student "+(i+1)+"----");
    System.out.println("Name of the Student : "+name);
    System.out.println("Rollnumber of the Student : "+rollno);
    System.out.println("Age of the Student : "+age);
}
}
public class students {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     System.out.print("Enter the number of Students : ");
     int n = sc.nextInt();

     Student[] stu = new Student[n];
     System.out.println("====Enter the details of the Students====");
     for(int i=0;i<n;i++){
        stu[i] = new Student();
        stu[i].getDetails(sc, i);
     }
    for(int i=0;i<n;i++){
        stu[i].Display(i);
    }
    sc.close();
    }
}
