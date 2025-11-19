import java.util.Scanner;

public class gcd_lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of numbers: ");
        int n = sc.nextInt();

       System.out.print("Enter number 1: ");
        int gcd = sc.nextInt();
        int lcm = gcd;

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int b = sc.nextInt();

            int x = gcd , y = b;
            while (y != 0) {
                int temp = y;
                y = x % y;
                x = temp;
            }
            
            gcd = x;
           lcm = (lcm * b) / gcd;
        }
        System.out.println("GCD of given " + n + " numbers is: " + gcd);
        System.out.println("LCM of given " + n + " numbers is: " + lcm);
        sc.close();
    }
}
