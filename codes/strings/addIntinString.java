import java.util.Scanner;

public class addIntinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String word = sc.nextLine();
        
       int n=word.length();
       int total = 0;
       for(int i=0;i<n;i++){
           if(word.charAt(i) >= '0' && word.charAt(i) <='9'){
            int m = word.charAt(i)-'0';
            total = total + m;
           }
        }
        System.out.println("Sum of digits in the String : "+total);
        sc.close();
    }
    
}
