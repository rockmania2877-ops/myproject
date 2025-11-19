package arrays;
import java.util.Scanner;

public class neil_armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.of numbers : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter the num "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        for(int k=0;k<n;k++){
            int num = arr[k];
            double result = 0;
            int count = 0;
            int temp = num;
            int original = num;
            boolean isArm = false;
            while(temp>0){
                temp=temp/10;
                count++;
            }
            temp=num;
            while(num>0){
                int a = num % 10;
                result = result + Math.pow(a,count);
                num = num / 10;
            }
            if(result==original){
                isArm = true;
            }
                if(isArm){
                System.out.println((original)+" is a armstrong number");
            }else{
                 System.out.println((original)+" is not a armstrong number");
            }

        }
        sc.close();

    }
}
