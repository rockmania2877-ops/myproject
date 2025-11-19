package strings;
import java.util.Scanner;

public class Hash_in_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String word = sc.nextLine();
        word=word.toLowerCase();
        
        int l = word.length();
        String rev = "";

        for (int i=0;i<l;i++){
            char c = word.charAt(i);
            if(c >='a'&& c <='z' || c >='0' && c<='9'){
                rev = ""+rev + c;
            }else{
                c = '#';
                rev = rev + c;
            }
        }
        System.out.println("Revised String : "+rev);
        sc.close();
    }
}
