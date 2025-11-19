package Basic;

import java.util.Scanner;
public class DigitGiven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        System.out.print("Enter the digit you want to find : ");
        int digit = sc.nextInt();

        int original = num;
        boolean found = false;

        while (num > 0) {
            int result = num % 10;   
            if (result == digit) {
                found = true;
                break;
            }
            num = num / 10; 
        }

        if (found) {
            System.out.println("The number " + original + " contains the digit " + digit);
        } else {
            System.out.println("The number " + original + " does NOT contain the digit " + digit);
        }

        sc.close();
    }
}
