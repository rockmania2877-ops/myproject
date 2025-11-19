import java.util.Scanner;

public class area { 
    static double area_of_triangle(int a,int b,int c){
        int s = (a+b+c)/2;
        double area =Math.sqrt((s)*(s-a)*(s-b)*(s-c));
        return area;
    }
    static double area_of_square(int a){
        double area = a*a;
        return area;
    }
    static double area_of_rectangle(int a,int b){
        double area = a * b;
        return area;
    }
    static double area_of_circle(int r){
        double area = Math.PI * r * r;
        return area;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        while (true){
        System.out.println("------Choose the shape------");
        System.out.println("1 - Triangle");
        System.out.println("2 - Square");
        System.out.println("3 - Rectangle");
        System.out.println("4 - Circle");
        System.out.println("5 - To exit the program.");

        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();

         
        switch(choice) {
            case 1:
            System.out.print("Enter the three sides of the triangle : ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            System.out.println("Area of the trinagle : "+area_of_triangle(x,y,z));
            break;

            case 2:
            System.out.print("Enter the length of side : ");
            int a = sc.nextInt();
            System.out.println("Area of the square : "+area_of_square(a));
            break;

            case 3:
            System.out.print("Enter the length of the opposite sides of the rectangle : ");
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println("Area of the Rectangle : "+area_of_rectangle(b,c));
            break;

            case 4:
            System.out.print("Enter the radius of the circle : ");
            int d = sc.nextInt();
            System.out.println("Area of the circle : "+area_of_circle(d));
            break;

            case 5:
            System.out.println("ThankYou!");
            sc.close();
            return;

            default :
            System.out.println("Invalid choice! Please enter between 1-4");
        }   
      }   
    
   }
}
