package File_handling;
import java.io.FileWriter;
import java.io.IOException;

public class intro {
    public static void main(String[]args){

        try{
            FileWriter writer = new FileWriter("intro.txt");
            writer.write("This is my first day of file handling");
            writer.close();
            System.out.println("File written successfully.");
        }catch (IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
