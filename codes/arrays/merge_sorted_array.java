import java.util.Scanner;
public class merge_sorted_array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.of elements for both arrays : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        for (int i=0;i<m;i++){
            System.out.print("Enter the element "+(i+1)+" for First array : ");
            arr1[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.print("Enter the element "+(i+1)+" for Second array : ");
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = new int[m+n];
        for(int i=0;i<m;i++){
            arr3[i] = arr1[i];
        }
        for(int i=0;i<n;i++){
            arr3[i+m] = arr2[i];
        }
        for (int i=0;i<m+n-1;i++){
            for(int j=0;j<m+n-i-1;j++){
                if(arr3[j]>arr3[j+1]){
               int min = arr3[j];
                arr3[j] = arr3[j+1]; 
                arr3[j+1] = min;
            }
        }
    }
        System.out.print("Merged and sorted Array : ");
        for(int i=0;i<m+n;i++){
            System.out.print(arr3[i]+" ");
        }
        sc.close();
    }
}