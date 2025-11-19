import java.util.Scanner;

public class symmetry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String word = sc.nextLine();
        int l = word.length();
        int a = l/2;
        String sym = "";
        String met = "";
        for (int i=0;i<a;i++){
            char c = word.charAt(i);
            sym = sym + c;
        }
        for(int i=a;i<l;i++){
            char c = word.charAt(i);
            met = met + c;
        }
        if(sym.equals(met)){
            System.out.println("The given string is symmteric.");
        }else{
            System.out.println("The given string is not symmteric.");
        }
sc.close();
    }
    
}
