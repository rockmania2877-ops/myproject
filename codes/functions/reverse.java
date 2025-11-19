import java.util.Scanner;
public class reverse {
    static String rev(String word){
       String reverse = "";
        int r = word.length() - 1;
       
        while (r>=0){
           reverse = reverse +  word.charAt(r);
         r--;
        }
        
        return reverse;
    }
   public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the string : ");
    String vaarthai = sc.nextLine();

    System.out.println("Reversed string : "+rev(vaarthai));
    sc.close();


}    
}
