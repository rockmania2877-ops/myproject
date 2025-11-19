package classes;
import java.util.Scanner;

class student{
    String name;
    int roll;
    double mark1,mark2,mark3,mark4,mark5,mark6;
    double cutoff1,cutoff2,cutoff3;
    double tot;
    double per;

void getDetails(Scanner sc,int i){
    System.out.println("==== Details of Student "+(i+1)+" ===");
    System.out.print("Name : ");
    name = sc.nextLine();
    System.out.print("Rollno : ");
    roll = sc.nextInt(); 
    System.out.print("Tamil mark : ");
    mark5 = sc.nextDouble();
    System.out.print("English mark : ");
    mark6 = sc.nextDouble();
    System.out.print("Maths mark : ");
    mark1 = sc.nextDouble();
    System.out.print("Physics mark : ");
    mark2 = sc.nextDouble();
    System.out.print("Chemistry mark : ");
    mark3 = sc.nextDouble();
    System.out.print("Biology mark : ");
    mark4 = sc.nextDouble();
    sc.nextLine();
}
void process(int i){
    tot = mark1+mark2+mark3+mark4+mark5+mark6;
    per = tot/6;
    cutoff1 = (mark1) + ((mark2+mark3)/2);
    cutoff2 = ((mark4/2) + ((mark2+mark3)/4))*2;
    cutoff3 = (mark1+mark2+mark3+mark4)/2;
}
void display(int i){
    System.out.println("\n==== Student No."+(i+1)+" ====");
    System.out.println("Name : "+name);
    System.out.println("RollNumber : "+roll);
    System.out.println("Total : "+tot+"/600");
    System.out.println("Percentage : "+per+"%");
    System.out.println("Enginerring Cutoff : "+cutoff1+"/200");
    System.out.println("Medical Cutoff : "+cutoff2+"/200");
    System.out.println("Agri Cutoff : "+cutoff3+"/200");
}
}
public class studentMark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.of Students : ");
        int n = sc.nextInt();
        sc.nextLine();
        
        student[] stu = new student[n];
        for(int i=0;i<n;i++){
           stu[i] = new student();
           stu[i].getDetails(sc, i);
           stu[i].process(i);
        }
        double r1=0,r2=0,r3=0,r4=0,r5=0,r6=0;
        for(int i=0;i<n;i++){
            r1 = r1 + stu[i].mark1;
            r2 = r2 + stu[i].mark2;
            r3 = r3 + stu[i].mark3;
            r4 = r4 + stu[i].mark4;
            r5 = r5 + stu[i].mark5;
            r6 = r6 + stu[i].mark6;
        }
        double avg1 = r1/n;
        double avg2 = r2/n;
        double avg3 =r3/n;
        double avg4 =r4/n;
        double avg5 =r5/n;
        double avg6 =r6/n;

        System.out.println("Average of Tamil mark : "+avg5);
        System.out.println("Average of English mark : "+avg6);
        System.out.println("Average of Maths mark : "+avg1);
        System.out.println("Average of Physics mark : "+avg2);
        System.out.println("Average of Chemistry mark : "+avg3);
        System.out.println("Average of Biology mark : "+avg4);

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(stu[j].tot < stu[j+1].tot){
                    student temp = stu[j];
                    stu[j] = stu[j+1];
                    stu[j+1] = temp;
                }
            }
        }
        System.out.println("----Rank list----");
        int j = 1;
        for(int i=0;i<n;i++){
            System.out.println((j)+"."+stu[i].name);
            j = j+1;
        }
        sc.close();
    }
}
