package functions;
import java.util.Scanner;

public class digit_given {
    static boolean digit(int a,int b){
         while (a > 0){
        int num = a % 10;
        if (num == b){
        return true;
        }   
        a = a / 10;   
    }
 return false;
}
public static void main(String[]args){
   Scanner sc = new Scanner(System.in);

   System.out.print("Enter the number : ");
   int num = sc.nextInt();

   System.out.print("Enter the digit : ");
   int digit = sc.nextInt();

   if(digit(num,digit)){
    System.out.println("The given number " +num+ " contains the digit "+digit);
   }else {
    System.out.println("The given number " +num+ " does not contain the digit "+digit);
   }

sc.close();
}
      
}
