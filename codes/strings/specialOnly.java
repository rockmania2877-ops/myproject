import java.util.Scanner;
public class specialOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String(Include Special Characters) : ");
        String word = sc.nextLine();

        int n = word.length();
        String rev = "";
        for(int i=0;i<n;i++){
              char c = word.charAt(i);
              char l = Character.toLowerCase(c);
            if(!(l >= '0' && l <= '9' || l >= 'a' && l<='z')){
                rev = rev + c;
            }
        }
        System.out.println("Revised String : "+rev);
        sc.close();
    }
    
}
