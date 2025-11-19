package recursion;
import java.util.Scanner;
public class palindrome{
    static boolean isPalindrome(String s,int a,int z){
        if(a >= z) return true;
        if(s.charAt(a) != s.charAt(z)) return false;

        return isPalindrome(s,a+1,z-1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);

        System.out.print("Enter the word : ");
        String word = sc.nextLine();

        if(isPalindrome(word,0,word.length()-1)){
            System.out.println("Palindrome.");
        }else {
            System.out.println("not palindrome.");
        }
        sc.close();
    }
}