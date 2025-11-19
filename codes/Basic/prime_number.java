package Basic;
import java.util.Scanner;
public class prime_number{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number : ");
int a = sc.nextInt();
boolean isPrime = true;

if(a<=1){
    System.out.println("Invalid! Enter a number greater than 1.");
}else {
    for (int i=2;i<(a/2);i++){
        if(a%i==0){
        isPrime = false;
        break;
    }
    }
        if(isPrime){
            System.out.println("The given number " +a+ " is a prime number");
        }else{
            System.out.println("The given number "+a+ " is not a prime number.");
        }
   
     }
      sc.close();
    }
}