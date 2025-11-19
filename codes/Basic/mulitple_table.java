package Basic;
import java.util.Scanner;
public class mulitple_table {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        System.out.print("Enter the number of terms : ");
        int n  = sc.nextInt();

        int result = num; 
        int original = num; 
        for (int i=1;i<=n;i++){
            result = original * i;
            System.out.println(i+" X "+num+ " = "+result);        
        }
        sc.close();
    }
}
