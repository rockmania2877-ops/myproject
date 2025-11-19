package strings;
import java.util.Scanner;

public class reverse_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String s = sc.nextLine();

        String[] word = s.split(" ");
        String reverse = "";
        for(int i=word.length-1;i>=0;i--){
             reverse = reverse+" " + word[i]; 
        }
        System.out.print("Reversed String : "+reverse);
        sc.close();
    }
}
