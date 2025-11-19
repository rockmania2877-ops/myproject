import java.util.Scanner;
public class factorial{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int factorial = 1;
        if (num < 0){
            System.out.println("No negative numbers for factorial.");
        }else {
            for (int i=1;i <= num;i++){
                factorial = factorial * i;
            }
            System.out.println("The factorial of the given number " +num+ " is " +factorial);
        }
        sc.close();
    } 
    
}
