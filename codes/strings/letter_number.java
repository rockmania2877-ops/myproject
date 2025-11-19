package strings;
import java.util.Scanner;

public class letter_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.of words : ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the word "+(i+1)+" : ");
            arr[i] = sc.nextLine();
        }
        for(int i=0;i<n;i++){
            String word = arr[i];
            boolean isDigit = false;
            boolean isLetter = false;
            for(int k=0;k<word.length();k++){
                char c = word.charAt(k);
                if ((c >= 'A'&& c <= 'Z') || (c>='a'&&c<='z')){
                    isLetter = true;
                }
                if(c >='0' && c <='9'){
                    isDigit = true;
                }
            }
            if(isLetter && isDigit){
                System.out.println("The given string "+word+" is valid.");
            }else{
                  System.out.println("The given string "+word+" is not valid.");
            }
        }
        sc.close();
    }
}
