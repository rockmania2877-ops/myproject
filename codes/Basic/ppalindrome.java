package Basic;
import java.util.Scanner;
public class ppalindrome {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the word : ");
         String name = sc.nextLine();         
         int l = 0;
         int r = name.length() - 1;
         boolean isPalindrome = true; 
    while (l<r){
    if (name.charAt(l) != name.charAt(r)){
        isPalindrome =false;
        break;
    }
    l++;
    r--;
}
if (isPalindrome){
    System.out.println("The given string " +name+ " is palindrome");
}else{
    System.out.println("The given string " +name+ " is not palindrome");
}
sc.close();
    }   
}