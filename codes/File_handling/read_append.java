package File_handling;
import java.util.*;
import java.io.*;

public class read_append {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the directory of the file : ");
        String fileName = sc.nextLine();

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = reader.readLine())!=null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("Error reading the line.");
            e.printStackTrace();
        }

        System.out.print("\nDo you want to 1.append (or) 2.delete the file : ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch(choice){
            case 1:
            try(FileWriter writer = new FileWriter(fileName,true)){
                System.out.print("-----Enter the content to append on the file (stop) to end-----");
                while(true){
                    String line = sc.nextLine();
                    if(line.equalsIgnoreCase("stop")) break;
                        writer.write(line+"\n");
                }
                    System.out.println("File appended successfully");
            }catch (IOException e){
                System.out.println("Error appending the file");
            }
            break;
        
            case 2:
            File file = new File(fileName);
            if(file.delete()){
                System.out.println("File deleted successfully");
            }else{
                System.out.println("Error deleting the file.");
            }
            break;

            default:
            System.out.println("Invalid choice");
        } 
        sc.close();
    }
}
