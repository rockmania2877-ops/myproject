package strings;
import java.util.Scanner;

public class only_int{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String word = sc.nextLine();
        String rev ="";
        int l = word.length();
        int count=0;
        int result = 0;
        for(int i=0;i<l;i++){
            char c = word.charAt(i);
            if(c >='0' && c <='9'){
                rev = rev + c;
                int a = c-'0';
                result = result + a;
                count = count + 1;
            }
        }
        int avg = result / count;
        System.out.println("Revised string : "+rev);
        System.out.println("Sum of the digits in string : "+result);
        System.out.println("Average of the sum : "+avg);
        sc.close();
    }
}