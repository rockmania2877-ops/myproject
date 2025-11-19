import java.util.Scanner;
public class sum_of_squares {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms : ");
        int term = sc.nextInt();

        int result = 0;
        for (int i=1;i<=term;i++){
            result = result + (i*i);
        }
        System.out.println("Sum of squares from one to "+term+ " is " +result);
        sc.close();
    }
}