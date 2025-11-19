import java.util.Scanner;
public class start_middle_end {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String word = sc.nextLine();

        int l = word.length()-1;
        int a = l/2;
        char c = word.charAt(0);
        char d = word.charAt(a);
        char e = word.charAt(l);
        String rev = ""+c+d+e;
        System.out.println("Revised string : "+rev);

        sc.close();
    }
}
