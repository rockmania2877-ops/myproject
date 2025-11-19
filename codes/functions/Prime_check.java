package functions;
import java.util.Scanner;
public class Prime_check {
    static boolean isPrime(int a){
        if (a == 0  ||  a == 1){
            System.out.print("Invalid!");
            return false;
        }
            for (int i=2;i<=(a/2);i++){
                int b = a%i;
            if (b==0){
             return false;
            }
            }
            return true;      
             }
            public static void main(String[]args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number : ");
            int num = sc.nextInt();
            
            if(isPrime(num)){
                System.out.println("The number is prime");
            }
            else {
                System.out.println("The number is not prime");
          }            
            sc.close();
    }
 }
 