import java.util.Scanner;

public class mul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.of elements : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] raa = new int[n];
        int[] res = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter the number "+(i+1)+" : ");
            arr[i] = sc.nextInt();
            System.out.print("Enter the_number to multiply with "+arr[i]+" : ");
            raa[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            res[i] = arr[i] * raa[i];
        }
        System.out.print("New array : ");
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
        sc.close();
    }
}
