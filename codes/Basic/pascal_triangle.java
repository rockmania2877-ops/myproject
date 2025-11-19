import java.util.Scanner;
public class pascal_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.of rows : ");
        int rows = sc.nextInt();

        for(int i = 0;i < rows;i++){
            for(int space = 0;space < rows-i;space++){
            System.out.print(" ");
            }
            int num =1;
            for (int j = 0;j<=i;j++){
                System.out.print(" "+num);
                num = num * (i-j)/(j+1);
            }
            System.out.println();
        }
        sc.close();
    }
}