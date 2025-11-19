import java.util.Scanner;
public class arithmetic{
static int add(int a,int b){
    return a+b;
}
static int sub(int a,int b){
    return a-b;
}
static int mul(int a,int b){
    return a*b;
}
static double div(int a,int b){
    if (b==0){
        System.out.println("Impossible to divide by zero.");
        return Double.NaN; 
}   
return (double) a/b;
}
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the two numbers : ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    System.out.println("Sum = " +add(num1,num2));
    System.out.println("Difference = " +sub(num1,num2));
    System.out.println("Product = "+mul(num1,num2));
    System.out.println("Division = "+div(num1,num2));

    sc.close();
}
}
