package File_handling;
import java.io.*;
import java.util.Scanner;

public class read {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file name you want to read: ");
        String lines = sc.nextLine();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(lines));
            String line;
            while((line=reader.readLine())!= null){
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
  sc.close();
    }
}
