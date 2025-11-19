import java.util.Scanner;

public class remove_special {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        String reverse = "";
        int l = str.length();

        for(int i=0;i<l;i++){
            char c = str.charAt(i);
            if (c >='a' && c<='z' || c >='0' && c<='9'){
                reverse = reverse + c;
            }
        }
        System.out.println("Revised string : "+reverse);
        sc.close();
    } 
}
