package arrays;
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of terms : ");
    int n = sc.nextInt();

    int[] a = new int[n];
    
    for(int i=0;i<n;i++){
    System.out.print("Enter the element "+(i+1)+" : ");
    a[i] = sc.nextInt();
    }

    System.out.println("Enter the choice : ");
    System.out.println("1.Addition");
    System.out.println("2.Multiplication");
    System.out.println("3.Sorting");
    int choice = sc.nextInt();

    switch (choice) {

        case 1:
        int sum = 0;
        for (int x : a){
            sum = sum + x;
        }
        System.out.println("Sum = "+sum);
        break;

        case 2:
        int pro = 1;
        for (int x : a){
            pro = pro * x;
        }
        System.out.println("Product = "+pro);
        break;

       case 3:
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (a[j] > a[j + 1]) {
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
        }
    }

    System.out.print("Sorted Array: ");
    for (int x : a) {
        System.out.print(x + " ");
    }
    System.out.println();
    break;

        default :
        System.out.println("Invalid choice!");      

        }
        sc.close();
    }
}
