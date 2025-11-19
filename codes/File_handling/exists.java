package File_handling;
import java.util.*;
import java.io.*;

public class exists {
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the file directory to find whether it's exists or not : ");
      String fileName = sc.nextLine();

      File f = new File(fileName);
      try{
      if(f.exists()){
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        System.out.println("Filename : "+f.getName());
        System.out.println("File path : "+f.getAbsolutePath());
        System.out.println("File size : "+f.length());
        System.out.println("Readable : "+f.canRead());
        System.out.println("Writable : "+f.canWrite());
        System.out.println("-------INFO------");
        while((line=reader.readLine())!=null){
        System.out.println(line);
        }
        reader.close();
      }else{
        System.out.println("File doesn't exists.");
      }
    }catch (IOException e){
        System.out.println("Invalid.");
        e.printStackTrace();
    }
    sc.close();
}
}
