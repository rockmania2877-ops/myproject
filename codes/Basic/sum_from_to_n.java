package Basic;
import java.util.Scanner;
public class sum_from_to_n {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower number : ");
        int m = sc.nextInt();
        System.out.print("Enter the larger number : ");
        int n = sc.nextInt();

        int result = 0;
        if(m>n){
            System.out.print("Invalid! m should be less than n");
        }else {
            for (int i=m;i<=n;i++){
                result = result + i;
            }
            System.out.println("Sum from m to n : "+result);
        }
        sc.close();
    }    
}
