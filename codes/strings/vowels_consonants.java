package strings;

import java.util.Scanner;

public class vowels_consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String (Ignore digits) : ");
        String word = sc.nextLine();
            int vowel = 0;
            int conso = 0;
            String vow = "";
            String con = "";
        for(int i=0;i<word.length();i++){
            char c = Character.toLowerCase(word.charAt(i));
           if(c >='a' && c <='z' ){
           if(c == 'a' || c=='e' ||c == 'i' ||c == 'o' ||c == 'u'){
            vow = vow+ " " + c;
            vowel++;
           }
           else{
            con = con +" "+ c;
            conso++;
           }
           }
        }
        System.out.println("Vowels : "+vow);
        System.out.println("No.of vowels : "+vowel);
        System.out.println("Consonants : "+con);
        System.out.println("No.of Consonants : "+conso);
        sc.close();
    }
}
