import java.util.Scanner;

public class anagrams {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the word 1 : ");
        String str1 = sc.nextLine();

        System.out.print("Enter the word 2 : ");
        String str2 = sc.nextLine();

        if(str1.length() != str2.length()){
            System.out.print("No Anagrams.");
        }
        int[] arr = new int[26];

        for (int i =0;i<str1.length();i++){
            char c = str1.charAt(i);
            if (c >= 'a' && c <= 'z'){
                arr[c - 'a']++;
            }
        }
        for (int i =0;i<str2.length();i++){
            char c = str2.charAt(i);
            if (c >='a' && c <= 'z'){
                arr[c - 'a']--;
            }
        }
        boolean isAnagram = true;
        for (int i=0;i<26;i++){
            if(arr[i] != 0){
                isAnagram = false;
                break;
            }
        }
        if (isAnagram){
            System.out.println("Both are anagrams.");
        }else{
         System.out.println("Both are not anagrams."); 
        }
        sc.close();
    }
    
}
