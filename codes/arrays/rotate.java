import java.util.Scanner;
public class rotate {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.of terms in the array : ");
        int n = sc.nextInt();

        System.out.print("Enter the rotation number : ");
        int r = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter the element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        int[] rot = new int[n];
        for(int i=0;i<n;i++){
            rot[(i+r)%n]=arr[i];
        }
        System.out.print("Rotated array : ");
        for(int i=0;i<n;i++){
            System.out.print(rot[i]+" ");
        }
        sc.close();
    }
}
