package Basic;
import java.util.Scanner;
public class sum_and_average {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the lower number 'a' : ");
    int a = sc.nextInt();
    System.out.print("Enter the higher number 'b' : ");
    int b = sc.nextInt();

    if (a>=b){
        System.out.print("Impossible! a should be less than b");
    } else {
            int result = 0;
           for (int i=a;i<=b;i++){
            result = result + i;
            
           }
           System.out.print("The sum of numbers from "+a+ " to " +b+ " is " +result);
           

        }
        sc.close();
    }

    
}

