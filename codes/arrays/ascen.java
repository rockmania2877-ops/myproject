import java.util.Scanner;

public class ascen {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.of numbers : ");
        int n = sc.nextInt();

        int[] num = new int[n];
        for (int j=0;j<n;j++){
            System.out.print("Enter the number "+(j+1)+" : ");
            num[j] = sc.nextInt();
        }
        
       for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(num[j]>num[j+1]){
                int temp = num[j];
                num[j] = num[j+1];
                num[j+1] = temp;
            }
        }
       }

       System.out.print("Ascending order : ");
       for(int i =0;i<n;i++){
        System.out.print(num[i]+" ");
        }
        sc.close();
    }
    
}
