package functions;
import java.util.Scanner;

public class palindromes {
    static boolean isPalindrome(String word) {
        int l = 0;
        int r = word.length() - 1;

        while (l < r) {   
            if (word.charAt(l) != word.charAt(r)) {
                return false;  
            }
            l++;
            r--;
        }
        return true;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String sen = sc.nextLine();

        if (isPalindrome(sen)) {
            System.out.println("The given string is palindrome");
        } else {
            System.out.println("The given string is not palindrome");
        }

        sc.close();
    }
}
