package File_handling;
import java.util.*;
import java.io.*;

public class count {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name with extension: ");
        String fileName = sc.nextLine();

        int charCount = 0;
        int lineCount = 0;
        int wordCount = 0;

        try{
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while((line=reader.readLine())!=null){
                lineCount = lineCount + 1;

                charCount = charCount + line.length();

                if(!line.trim().isEmpty()){
                    String[] words = line.trim().split("\\s+");
                    wordCount = wordCount + words.length;
                }
            }
            reader.close();
            System.out.println("------FILE ANALYSIS------");
            System.out.println("Total lines : "+lineCount);
            System.out.println("Total words : "+wordCount);
            System.out.println("Total characters : "+charCount);
        }catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
        sc.close();
    }
}
