package arrays;
import java.util.Scanner;

public class rever_add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of the Arrays : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];

        for(int i = 0; i < m; i++){
            System.out.print("Enter the num " + (i+1) + " for Array 1 : ");
            arr1[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            System.out.print("Enter the num " + (i+1) + " for Array 2 : ");
            arr2[i] = sc.nextInt();
        }

        int size = Math.max(m, n);
        int[] arr3 = new int[size];

        int min = Math.min(m, n);
        for(int i = 0; i < min; i++){
            arr3[i] = arr1[i] + arr2[i];
        }

        if(m > n){
            for(int i = n; i < m; i++){
                arr3[i] = arr1[i];
            }
        } else if(n > m){
            for(int i = m; i < n; i++){
                arr3[i] = arr2[i];
            }
        }

        System.out.print("New Array : ");
        for(int i = 0; i < size; i++){
            System.out.print(arr3[i] + " ");
        }

        sc.close();
    }
}
