import java.util.Scanner;
public class gcd {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.of numbers : ");
        int n = sc.nextInt();
        System.out.print("Enter the number 1 : ");
        int result  = sc.nextInt();

        for(int i=2;i<=n;i++){
            System.out.print("Enter the number " +i+ " : ");
            int num = sc.nextInt();

          int a = result, b=num;
            while (b!=0){
                int temp =b;
                b = a%b;
                a = temp;
            }
            result = a;
        }
        System.out.println("The GCD of the numbers is : " +result);
        sc.close();
    }
    
}
