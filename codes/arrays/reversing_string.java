package arrays;
import java.util.Scanner;

public class reversing_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.of terms : ");
        int n = sc.nextInt();
        sc.nextLine();
        
        String[] arr = new String[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter the word "+(i+1)+" : ");
            arr[i] = sc.nextLine();
        }
        for(int k=0;k<n;k++){
            String word = arr[k];
            int l = word.length()-1;
            String reverse = "";
            for(int j=l;j>=0;j--){
             reverse = reverse+word.charAt(j);
            }
            System.out.println("Reversed String : "+reverse);
        }
        sc.close();
    }
}
