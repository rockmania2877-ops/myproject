package recursion;
import java.util.Scanner;

public class prime_check {
    static boolean isPrime(int n,int i){
        if (n<=1) return false;
        if (i==1) return true;
        if (n % i == 0) return false;

        return isPrime(n,i-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        if (isPrime(num,num/2)){
            System.out.print("Prime number.");
        }else{
            System.out.print("Not a prime number.");
        }        
        sc.close();
    }
}