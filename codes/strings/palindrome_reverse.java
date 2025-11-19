package strings;
import java.util.Scanner;

public class palindrome_reverse {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        str=str.toLowerCase();

        String reverse = "";
        int l = str.length()-1;

        for(int i=l;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reversed string : "+reverse);

        if(reverse.equals(str)){
            System.out.println("The given string is palindrome");
        }else{
            System.out.println("The given string is not palindorme");
        }
        sc.close();
    }
}
