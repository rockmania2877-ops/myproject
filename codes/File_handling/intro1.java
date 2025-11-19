package File_handling;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class intro1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Word you want : ");
        String word = sc.nextLine();

        try{
            FileWriter writer = new FileWriter("files/new.txt");
            writer.write(word);
            writer.close();
        }catch (IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
        sc.close();
    }
}
