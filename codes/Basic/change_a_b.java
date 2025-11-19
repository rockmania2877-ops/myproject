package Basic;
import java.util.Scanner;
public class change_a_b {
    public static void main(String[]args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the first number : ");
int a = sc.nextInt();
System.out.print("Enter the second number : ");
int b = sc.nextInt();

int temp;
temp = a;
a = b;
b = temp;
System.out.println("After exchanging Both");
System.out.println("First number = "+a);
System.out.println("Second number = "+b);
sc.close();

    }
    
}
