import java.util.Scanner;

public class factorial{
static int fact(int a){
     if (a==0 || a==1)
        return 1;
        return a * fact(a-1);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number : ");
    int num = sc.nextInt();
    int result = 1;
    
    if(num<0){
        System.out.print("Factorial is not defined for negative numbers");
    }else{
    result = fact(num);
    System.out.print("Factorial = "+result);
    }
    
    sc.close();
}
}