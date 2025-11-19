package Basic;
import java.util.Scanner;
public class letter {
    public static void main(String[]arrgs){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the word : ");
        String word = sc.nextLine();

        System.out.print("Enter the letter : ");
        String letter = sc.nextLine();

       
        boolean isLetter=false;
        for (int i = 0;i < word.length()-1;i++){
            char c = word.charAt(i);
            if (String.valueOf(c).equalsIgnoreCase(letter)){
                isLetter = true;
                break;
            }
        }
        
        if(isLetter){
            System.out.println("The given word "+word+" contains the letter '"+letter+"'");
        }else {
            System.out.println("The given word "+word+" doesn't contain the letter '"+letter+"'");
        }
        sc.close();

    }
    
}
