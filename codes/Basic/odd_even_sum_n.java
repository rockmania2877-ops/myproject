package Basic;
import java.util.Scanner;

public class odd_even_sum_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lower limit : ");
        int m = sc.nextInt();
        System.out.print("Enter the upper limit : ");
        int n = sc.nextInt();

        int odd_sum = 0;
        int even_sum = 0;

        if (m > n) {
            System.out.println("Invalid! lower limit should be lesser than upper limit.");
        } else {
           
            System.out.print("Even number sum : ");
            boolean first = true;
            for (int i = m; i <= n; i++) {
                if (i % 2 == 0) {
                    even_sum += i;
                    if (!first) {
                        System.out.print(" + ");
                    }
                    System.out.print(i);
                    first = false;
                }
            }
            System.out.println(" = " + even_sum);

           
            System.out.print("Odd number sum : ");
            first = true;
            for (int j = m; j <= n; j++) {
                if (j % 2 != 0) {
                    odd_sum += j;
                    if (!first) {
                        System.out.print(" + ");
                    }
                    System.out.print(j);
                    first = false;
                }
            }
            System.out.println(" = " + odd_sum);
        }

        sc.close();
    }
}
