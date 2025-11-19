package Basic;
import java.util.Scanner;
public class laip_year {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = sc.nextInt();

        int b=year % 4;
        if (b==0){
            System.out.println("The year (" +year+ ") is a leap year.");
        }else{
            System.out.println("The year (" +year+ ") is not a leap year.");
        }
        sc.close();

    }
    
}
