import java.util.Scanner;

public class countdown {
    static void count(int a){
        if (a==0){
            System.out.println("Green Signal");
            return;
        }
        System.out.println(a);
        count(a-1);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting point : ");
        int n = sc.nextInt();

        count(n);
        sc.close();
    }
}
