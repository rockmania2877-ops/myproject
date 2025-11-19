package File_handling;
import java.io.*;
import java.util.*;

public class append {
    public static void main(String[]args) throws IOException{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the directory of the file : ");
        String fileName = sc.nextLine();

        try(FileWriter writer = new FileWriter(fileName)){
            System.out.println("Enter the content to write on the file : ");
            while(true){
                String line = sc.nextLine();
                if(line.equalsIgnoreCase("STOP")) break;
                writer.write(line);
            }
            System.out.println("File Written successfully.");
        }catch (IOException e){
            System.out.println("Error writing the file"+e.getMessage());
        }

        try(FileWriter writer = new FileWriter(fileName,true)){
            System.out.print("Do you want to append more information?: ");
            String choice = sc.nextLine();
            if(choice.equalsIgnoreCase("yes")){
                System.out.println("Enter the content below to append");
                while(true){
                    String line = sc.nextLine();
                    if(line.equalsIgnoreCase("STOP")) break;
                    writer.write(line);
                }
                System.out.println("Data appended successfully");
            }else{
                System.out.println("No data appended");
            }
        }catch (IOException e){
            System.out.println("Error appending file "+e.getMessage());
        }
        sc.close();
    }
}
