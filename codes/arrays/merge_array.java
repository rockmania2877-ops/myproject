import java.util.Scanner;
public class merge_array{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no.of terms of arrays : ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
       System.out.println("Array 1");
        for(int i=0;i<m;i++){
            System.out.print("Enter the num "+(i+1)+" : ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("Array 2");
        for(int i =0;i<n;i++){
            System.out.print("Enter the num "+(i+1)+" : ");
            arr2[i] = sc.nextInt();
        }
         System.out.print("Array 1 : ");
         for(int i=0;i<m;i++){
            System.out.print(arr1[i]+" ");
         }
         System.out.print("\nArray 2 : ");
         for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
         }
         int [] arr3 = new int[m+n];
         for(int i=0;i<m;i++){
            arr3[i] = arr1[i];
         }
            for(int j=0;j<n;j++){
                arr3[m+j]=arr2[j];
            }
           System.out.print("\nMerged Array : ");
           for(int i=0;i<m+n;i++){
            System.out.print(arr3[i]+" ");
           }
           sc.close();
    }
}