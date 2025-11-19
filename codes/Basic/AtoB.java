
import java.util.Scanner;
public class AtoB {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A : ");
        int a = sc.nextInt();
        System.out.print("Enter B : ");
        int b = sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print("After swapping A = "+a+ " and B = "+b);
        sc.close();
    }
    
}
