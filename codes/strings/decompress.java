package strings;
import java.util.Scanner;

public class decompress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String (Denote the No.of times the Letter occurs) : ");
        String word = sc.nextLine();
        
        int n = word.length();
        String rev = "";
        for(int i=0;i<n;i++){
            String a = "";
            char c = word.charAt(i);
            if(!(c >= '0' && c <= '9')){
                for(int j=0;j<word.charAt(i+1)-'0';j++){
                    a = ""+ a+ word.charAt(i);
                }
            }
            rev = rev + a;
        }
        System.out.println("Revised String : "+rev);
        sc.close();
    }
}
