package Basic;
import java.util.Scanner;
public class n_times {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String word = sc.nextLine();
       
        System.out.print("Enter no.of times : ");
        int num = sc.nextInt();

        String result = ""; 
        for (int i=1;i<=num;i++){
          String times  = result + word;
            System.out.println(" " +times+ " ");
        }
        sc.close();
    }
}
