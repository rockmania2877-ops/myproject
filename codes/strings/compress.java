package strings;
import java.util.Scanner;

public class compress {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the String : ");
    String word = sc.nextLine();

    int n = word.length();
    String rev = "";

    for(int i=0;i<n;i++){
       int count = 1;
       while(i+1 < n && word.charAt(i)== word.charAt(i+1)){
        count = count + 1;
        i= i+1;
       }
            rev = rev + word.charAt(i) + (count + "");
        }
    System.out.println("Revised String : "+rev);
    sc.close();
}    
}
