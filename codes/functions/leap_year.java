import java.util.Scanner;

public class leap_year {
    static boolean leap(int year){
        int d = year % 4;
        if (d==0){
            return true;
        }
         return false;   
    }
   public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the year :");
    int year = sc.nextInt();

    if(leap(year)){
        System.out.print("Leap Year.");
    }
    else{
        System.out.print("Not a Leap Year.");
    }
    sc.close();
   }
}
