package arrays;
import java.util.Scanner;
public class prime_chick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.of numbers : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter the num "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        
        for(int k=0;k<n;k++){
           int num = arr[k];
           boolean isPrime = true;
           for(int j=2;j<=Math.sqrt(num);j++){
            if(num <=1){
                System.out.print("Not possible.");
           }else{
            if(num%j==0){
                isPrime = false;
                break;
            }
        }
    }
            if(isPrime){
                System.out.println(" "+num+" is a primenumber");
            }else{
                System.out.println(" "+num+" is not a primenumber");
            }
           
        }
        sc.close();
    }
}
