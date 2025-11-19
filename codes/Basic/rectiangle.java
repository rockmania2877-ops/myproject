package Basic;
import java.util.Scanner;
public class rectiangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length : ");
        int len = sc.nextInt();
        System.out.print("Enter the breadth : ");
        int bre = sc.nextInt();

        for(int i =1;i<=bre;i++){
            for(int j =1;j<=len;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
