package arrays;
import java.util.Scanner;
public class factorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.of terms : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter the num"+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
        if(arr[i]<0){
            System.out.println("Factorial Not possible for negative numbers : "+arr[i]);
        }else{
        long result = 1;
        for(int j=1;j<=arr[i];j++){
            result = result * j;
        }
        System.out.println("Factorial of "+arr[i]+" is "+result);
        }
    }
    sc.close();
    }
}
