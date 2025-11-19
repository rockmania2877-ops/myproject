import java.util.Scanner;

public class longest_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = sc.nextLine();

        String[] words = str.split(" ");
        String longest = words[0]; 

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];  
            }
        }

        System.out.println("The longest word in the sentence is: " + longest);
        sc.close();
    }
}
