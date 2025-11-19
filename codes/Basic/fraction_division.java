import java.util.Scanner;
public class fraction_division {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.of terms : ");
        int n = sc.nextInt();
        
        double a = 1,b=a+2;
        double result = 0;   
        for(int i=1;i<=n;i++){
        System.out.print(" "+(int)a+"/"+(int)b);
        if(i<n){
            System.out.print(" + ");
        }else{
            System.out.print(" ");
        }
        result = result + (a/b);
        a = a+1;
        b=b+2;
        }
        System.out.print("= "+result);
     sc.close();   
    }
    
}
