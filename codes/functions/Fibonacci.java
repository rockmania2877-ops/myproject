import java.util.Scanner;
public class Fibonacci{
    static void fibonacci(int n){
        int a=0;int b=1; int temp;
        for (int i=1;i<=n;i++){
            System.out.print(a+ " ");
        temp = a + b;
        a = b;
        b = temp;
        }
        
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.of terms : ");
        int terms = sc.nextInt();
        
        System.out.print("Fibonacci series upto n : ");
        fibonacci(terms);
        
        sc.close();
    }
}

