package File_handling;
import java.util.*;
import java.io.*;

public class read_write {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the filename with location you want to read and delete : ");
        String files = sc.nextLine();
        try{
        BufferedReader reader = new BufferedReader(new FileReader(files));
        String line;
        while((line = reader.readLine())!=null){
            System.out.println(line);
        }
        reader.close();
       } catch (IOException e){
            System.out.println("Failed to read the file");
            e.printStackTrace();
        }
        
        File file = new File(files);
        if(file.delete()){System.out.println("File deleted successfully after reading");}
        else{System.out.println("Error");}
        sc.close();
    }
}
