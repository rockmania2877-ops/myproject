package strings;
import java.util.Scanner;

public class mixed_string{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string 1 : ");
        String arr1 = sc.nextLine();
        System.out.print("Enter the string 2 : ");
        String arr2 = sc.nextLine();
         
        int m = arr1.length();
        int n = arr2.length();

        String arr3 = ""+arr1.charAt(0)+arr2.charAt(n-1)+arr1.charAt(1)+arr2.charAt(n-2);
        String arr4="";
        String arr5="";
        for(int i=2;i<m;i++){
            char c = arr1.charAt(i);
            arr4 = arr4 + c;
        }
        for(int i=0;i<=n-3;i++){
            char c = arr2.charAt(i);
            arr5 = arr5 + c;
        }
        arr3 = arr3 + arr4 + arr5;
        System.out.println("Revised string : "+arr3);
        sc.close();      
    }
}