package File_handling;
import java.io.*;
import java.util.*;

public class delete {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file name you want to delete: ");
        String files = sc.nextLine();

        File file = new File(files);

        if(file.delete()) {System.out.println(""+file.getName()+" deleted Successfully");}
        else{System.out.println("Failed to delete the file.");}
        sc.close();
    }
}
