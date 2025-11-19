package Basic;
import java.util.Scanner;
public class astersiks {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of asterisks : ");
        int n = sc.nextInt();
        for(int i=1;i <=n;i++){
            System.out.print("*");
        }
        sc.close();
    }    
}
