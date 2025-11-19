import java.util.Scanner;

public class second_max_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.of elements : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;

        for (int num : arr) {
       
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }

            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second maximum (all elements may be same).");
        } else {
            System.out.println("Second Maximum: " + secondMax);
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("No second minimum (all elements may be same).");
        } else {
            System.out.println("Second Minimum: " + secondMin);
        }

        sc.close();
    }
}
