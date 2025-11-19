import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms : ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.print("Enter the " + n + " numbers : ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Maximum number is : " + max);
        System.out.println("Minimum number is : " + min);

        sc.close();
    }
}
