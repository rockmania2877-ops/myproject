package strings;
import java.util.Scanner;

public class lowercase_first {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String word = sc.nextLine();
        
        int l = word.length();
        String low = "";
        String upp = "";
        String rev = "";
        for(int i=0;i<l;i++){
            char c = word.charAt(i);
            if(c >= 'a' && c<='z'){
                low = low + c;
            }
            else{
                upp = upp + c;
            }
        }
        rev = low + upp;
        System.out.println("Revised String : "+rev);
        sc.close();
    }
}
