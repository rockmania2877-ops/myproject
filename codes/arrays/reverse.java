import java.util.Scanner;

public class reverse {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.of elements in the array : ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter the "+(i+1)+" element : ");
            a[i] = sc.nextInt();
        }
        System.out.print("Reversed array : ");
        for(int i=n-1;i>=0;i--){
                System.out.print(" "+a[i]);
           }
        sc.close();
    }
    
}
