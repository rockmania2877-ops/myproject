package File_handling;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class next {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        int result = a+b;

        try{
            FileWriter writer = new FileWriter("Sum.txt");
            writer.write("Sum of "+a+" and "+b+" is "+result);
            writer.close();
        }catch (IOException e){
            System.out.println("An error occured during the process");
            e.printStackTrace();
        }
        sc.close();
    }
}
