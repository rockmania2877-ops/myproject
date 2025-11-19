import java.util.Scanner;

class rect{
    double l,b;
    double Perimeter,Area;

void getDetails(Scanner sc,int i){
        System.out.println("--- Input for the Rectangle "+(i+1)+" ---");
        System.out.print("Enter the Length of the rectangle "+(i+1)+" : ");
        l = sc.nextDouble();
        System.out.print("Enter the Breadth of the rectangle "+(i+1)+" : ");
        b = sc.nextDouble(); 
}
void calc(){
     Perimeter = 2*(l+b);
     Area = l*b;
}
void display(int i){
    System.out.println("=== Details of the Rectangle "+(i+1)+" ===");
    System.out.println("Length = "+l);
    System.out.println("Breadth = "+b);
    System.out.println("Area = "+Area);
    System.out.println("Perimeter = "+Perimeter);
 }
}
public class rectangle {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the no.of Rectangles : ");
    int n = sc.nextInt();

    rect[] rec = new rect[n];

    for(int i=0;i<n;i++){
        rec[i] = new rect();
        rec[i].getDetails(sc, i);
        rec[i].calc();
    }
     for(int i=0;i<n;i++){
       rec[i].display(i);
    }
    sc.close();
 }   
}
