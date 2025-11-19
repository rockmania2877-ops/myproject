import java.util.Scanner;

public class fibonacci {
    static int a = 0, b = 1;

    static void fibo(int n) {
        if (n > 0) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
            fibo(n - 1); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.of terms: ");
        int term = sc.nextInt();

        System.out.print("Fibonacci series: " + a + " " + b);
        fibo(term - 2); 

        sc.close();
    }
}
