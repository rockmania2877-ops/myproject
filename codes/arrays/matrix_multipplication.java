package arrays;
import java.util.Scanner;
public class matrix_multipplication {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows and colums of first matrix : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[][] m1 = new int[a][b];

        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print("Enter the element m1["+(+i+1)+"]["+(j+1)+"] : ");
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.println("------Matrix 1------");
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(m1[i][j]+" ");
            }
            System.out.println();
        }
         System.out.print("Enter the rows and colums of Second matrix : ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[][] m2 = new int[x][y];

        if(b!=x){
            System.out.print("Matrix Multiplication not possible!");
             sc.close();
             return;
        }
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print("Enter the element m2["+(+i+1)+"]["+(j+1)+"] : ");
                m2[i][j] = sc.nextInt();
            }
        }
        System.out.println("------Matrix 2------");
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print(m2[i][j]+" ");
            }
            System.out.println();
        }
        int[][] result = new int[a][y];

        for(int i=0;i<a;i++){
            for(int j=0;j<y;j++){
                result[i][j] = 0;
                for(int k=0;k<b;k++){
                    result[i][j] = result[i][j] + (m1[i][k]*m2[k][j]);
                }
            }
        }
        System.out.println("------Resultant matrix------");
        for(int i=0;i<a;i++){
            for(int j=0;j<y;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
