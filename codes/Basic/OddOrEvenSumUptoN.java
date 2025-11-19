package Basic;
import java.util.Scanner;

public class OddOrEvenSumUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range of the sum : ");
        int a = sc.nextInt();
        sc.nextLine();  

        System.out.print("Enter (odd) or (even) : ");
        String d = sc.nextLine();

        int result = 0;

        if (d.equalsIgnoreCase("even")) {
            for (int i = 0; i <= a; i = i + 2) {
                result = result + i;
            }
            System.out.println("Sum of even numbers up to " + a + " : " + result);
        } else if (d.equalsIgnoreCase("odd")) {
            for (int i = 1; i <= a; i = i + 2) {
                result = result + i;
            }
            System.out.println("Sum of odd numbers up to " + a + " : " + result);
        } else {
            System.out.println("Invalid choice! Please type 'odd' or 'even'.");
        }

        sc.close();
    }
}
