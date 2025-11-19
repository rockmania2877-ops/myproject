package arrays;
import java.util.Scanner;

public class counts {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.of terms : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter the num"+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element you want to count : ");
        int a =  sc.nextInt();

        int count =0;
       for(int i=0;i<n;i++){
         if(arr[i]==a){
            count = count + 1;
         }
       }
       System.out.print("The num "+a+" is present "+count+" times.");
       sc.close();
    }
}