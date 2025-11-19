import java.util.Scanner;
public class descen {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms : ");
        int n = sc.nextInt();

        int[] num = new int[n];

        System.out.print("Enter the numbers : ");
        for (int i=0;i<n;i++){
            num[i] = sc.nextInt();
        }

       for(int i=0;i<n-1;i++){
       for(int j=0;j<n-i-1;j++){
        if(num[j]>num[j+1]){
            int min = num[j];
            num[j] = num[j+1];
            num[j+1] = min;
        }
       }
    }
        System.out.print("Descending order : ");
        for (int j=n-1;j>=0;j--){
            System.out.print(num[j]+" ");
        }
        sc.close();
    }
    
}
