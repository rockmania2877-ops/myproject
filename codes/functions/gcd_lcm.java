package functions;
import java.util.Scanner;

public class gcd_lcm {
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.of numbers: ");
        int n = sc.nextInt();

        System.out.print("Enter number 1: ");
        int resultGCD = sc.nextInt();
        int resultLCM = resultGCD;

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            resultGCD = gcd(resultGCD, num);
            resultLCM = lcm(resultLCM, num);
        }

        System.out.println("GCD of all numbers: " + resultGCD);
        System.out.println("LCM of all numbers: " + resultLCM);

        sc.close();
    }
}
