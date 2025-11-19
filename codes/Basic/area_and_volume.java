package Basic;
import java.util.Scanner;
public class area_and_volume{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
 System.out.print("Enter the radius of the sphere : ");
 double radius=sc.nextInt();

 if (radius<0){
    System.out.print("Invalid! Radius should be postitve.");
 }else{
 
 double area = 4*3.14*radius*radius;
 double volume = (4.0/3.0) * radius * radius * radius;
 
System.out.print("The Area of the sphere : "+area+ "\n");
System.out.print("The volume of the sphere : " +volume);

 }
 sc.close();
}

}


