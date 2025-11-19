import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String word = sc.nextLine();
        word = word.toLowerCase();
        int count=0;
        int digit=0;
        int special = 0;
        for (int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if (c >= 'a' && c <= 'z'){
               count=count+1;
            }else if(c >='0' && c<='9'){
                digit=digit+1;
            }else{
                special=special+1;
            }
        }
        System.out.println("No.of letters : "+count);
         System.out.println("No.of Numbers : "+digit);
          System.out.println("No.of Special characters : "+special);
          sc.close();
    }
}
