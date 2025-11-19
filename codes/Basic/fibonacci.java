import java.util.Scanner;

public class fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;
        int next;

        if (num > 0) {
            System.out.print("Fibonacci series : ");
            for (int i = 0; i < num; i++) {
                System.out.print(a + " "); 
                next = a + b;              
                a = b;                     
                b = next;
            }
        } else {
            System.out.println("Invalid! Enter a positive number");
        }
        sc.close();
    }
}
