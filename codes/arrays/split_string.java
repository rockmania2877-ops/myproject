package arrays;
import java.util.Scanner;

public class split_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String word = sc.nextLine();

      String[] parts = word.split(" ");
      System.out.println("Splitted string : ");
      for(String part : parts){
        System.out.println(part);
      }
      sc.close();
    }
}
