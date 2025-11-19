import java.util.Scanner;

public class multiple_table {
    static void table(int a,int b){
        int result = 1;
        for (int i=1;i<=b;i++){
            result = i * a;    
            System.out.println(" "+i+" X "+a+" = "+result);    
        }    
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int x =sc.nextInt();

        System.out.print("Enter the no.of terms : ");
        int y = sc.nextInt();

        table(x,y);
        sc.close();
    }
}
