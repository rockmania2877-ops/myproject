package strings;
import java.util.Scanner;
public class middle_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String word = sc.nextLine();
        int l = word.length();
        int a = l / 2;
        String rev = "";
        rev =""+ word.charAt(a-1) + word.charAt(a)+ word.charAt(a+1);
        System.out.println("Revised string : "+rev); 
        sc.close();

    }
}
