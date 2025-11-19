import java.util.Scanner;
public class roots_of_quadratic_equation{
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the co=efficient of x^2 : ");
       int a = sc.nextInt();
       System.out.print("Enter the co-efficient of x : ");
       int b =sc.nextInt();
       System.out.print("Enter the constant : ");
       int c = sc.nextInt();

       double d = (b*b)-(4*a*c);
       double g = Math.sqrt(d);
       int e = 2*a;
       if (d==0){
        int root = (-b) / e;
        System.out.println("Real and Equal roots so,Both roots are same.");
        System.out.println("Roots = "+root);
       } else if (d>0){
        double root1 = ((-b) + g)/e;
        double root2 = ((-b) - g )/e;
        System.out.println("Real and unequal roots.");
        System.out.println("Root 1 = "+root1+"Root 2 = "+root2);
       }else {
        System.out.println("Imaginary roots.");
       }
       sc.close();

    }
}