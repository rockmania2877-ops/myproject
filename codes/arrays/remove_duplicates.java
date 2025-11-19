import java.util.Scanner;

public class remove_duplicates {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the no.of terms : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] temp = new int[n];
        int r=0;

        for(int i=0;i<n;i++){
            System.out.print("Enter the num "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++){
            boolean isDuplicate=false;
            for(int j=0;j<r;j++){
                if(arr[i]==temp[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                temp[r]=arr[i];
                r++;
            }
        }
      System.out.print("Revised Array : ");
       for(int i=0;i<r;i++){
        System.out.print(temp[i]+" ");
       }
       sc.close();
    }
}
