
import java.util.Scanner;

public class decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int binary = 0;
        int place = 1;   

        while (num > 0) {
            int remainder = num % 2;  
            binary = binary + remainder * place; 
            place = place * 10; 
            num = num / 2; 
        }

        System.out.println("Binary equivalent : " + binary);

        sc.close();
    }
}
