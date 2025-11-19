package functions;
import java.util.Scanner;

public class letter_given {
    static boolean letter(String word,String alpha){
    for (int i=0;i<=word.length()-1;i++){
        char c = word.charAt(i);
        if (String.valueOf(c).equalsIgnoreCase(alpha)){
            return true;
        }
    }
     return false;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the word : ");
        String string = sc.nextLine();

        System.out.print("Enter the letter : ");
        String digit = sc.nextLine();

        if(letter(string,digit)){
            System.out.println("The given word '"+string+"' contains the letter '"+digit+"'");
        }else{
            System.out.println("The given word '"+string+"' doesn't contain the letter '"+digit+"'");
        }
        sc.close();
    }
}
