package arrays;
import java.util.Scanner;

public class Odd_even_sum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of the Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter the element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        int odd_sum =0;
        int odd_count=0;
        int even_sum=0;
        int even_count=0;

        for(int i=0;i<n;i++){
           if(arr[i]%2==0){
            even_sum = even_sum + arr[i];
            even_count = even_count + 1; 
           }else{
            odd_sum = odd_sum + arr[i];
            odd_count = odd_count + 1;
           }
        }
        System.out.println("\nNo.of Odd numbers = "+odd_count);
        System.out.println("Sum of Odd Numbers = "+odd_sum);
        System.out.println("\nNo.of Even numbers = "+even_count);
        System.out.println("Sum of Even numbers = "+even_sum);
        sc.close();
    }
}
