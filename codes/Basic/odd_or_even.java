import java.util.Scanner;

public class odd_or_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
            System.out.print("Enter the number : ");
            int a = sc.nextInt();

        
            int d = a%2;
         if (d==1)
         {
            System.out.println("The given number is odd");
         }else {
            System.out.println("The given number is even");
         }
         sc.close();
        }
        
    }

