package arrays;
import java.util.Scanner;

public class num_rev_chk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] res = new int[n];
        System.out.print("Enter the "+n+" numbers : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int k=0;k<n;k++){
            int num = arr[k];
            int rev = 0;
            while(num>0){
              int a = num % 10;
              rev = (rev*10) + a;
              num /= 10; 
            }
            res[k] = rev;
        }
        for(int i=0;i<n;i++){
            int b = res[i];
            boolean isPrime=true;
            if(b <= 1){
                System.out.println("Not possible.");
            }else{
            for(int j=2;j<=Math.sqrt(b);j++){
                int m = b % j;
            if(m==0){
                isPrime=false;
            }  
          }
          if(isPrime){
            System.out.println(b+" is a primenumber.");
         }else{
            System.out.println(b+" is not a primenumber.");
         }  
         }
        }
        sc.close();
    }
}