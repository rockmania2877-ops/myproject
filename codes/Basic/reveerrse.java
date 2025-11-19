package Basic;
import java.util.Scanner;
public class reveerrse {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num=sc.nextInt();

        int result = 0;
        while (num > 0){
            int b = num %10;
            result = result * 10 + b;
            num = num / 10;
        }
        System.out.println("The reverse of the given number is " +result);
        sc.close();

    }
    
}
