import java.util.Scanner;
public class Factorial {
 static int factorial(int a){
    if(a<0){
        System.out.println("Invalid! number should be greater than 0.");
        return 0;
        }
    int result = 1;
    for (int i=1;i<=a;i++){
         result = result * i; 
    }
    return result;

 }   
 public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number : " );
    int num = sc.nextInt();
     
    int fact = factorial(num);
    while (fact !=0){
    System.out.println("Factorial : "+factorial(num));
    }
    sc.close();
 }
}
