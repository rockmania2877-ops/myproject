package strings;
import java.util.Scanner;

public class changeCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String word = sc.nextLine();

        int n = word.length();
        String c = "";
        for(int i=0;i<n;i++){
            if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z'){
                String a =""+ word.charAt(i);
                a = a.toUpperCase();
                c = c + a;
            } else if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z'){
                String a =""+ word.charAt(i);
                a = a.toLowerCase();
                c = c + a;
            }else{
                String a =""+ word.charAt(i);
                c = c + a;
            }
        }
        System.out.println("Revised String : "+c);
        sc.close();
    }    
}
