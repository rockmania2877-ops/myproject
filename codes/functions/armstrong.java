package functions;
import java.util.Scanner;

public class armstrong{
    static boolean arm(int a){
        int original = a;
        int count = 0;

        int temp = a;
      while (temp>0){
        temp = temp / 10;
        count ++;
     }
     
     double  result = 0;
     temp = a;
     while (temp > 0){
     int c = temp%10;
     result += Math.pow(c,count);
     temp = temp / 10;

    }
    return result == original;
}
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        if(arm(num)){
            System.out.println("The given number is a armstrong number");
        }
        else {
            System.out.println("The given number is not a armstrong number");
        }
        sc.close();
    }
}