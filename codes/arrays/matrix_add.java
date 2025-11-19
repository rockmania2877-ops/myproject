import java.util.Scanner;
public class matrix_add {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of order of the matrix (rows,colums) : ");
        int n = sc.nextInt();

        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];
        int[][] Add_matrix = new int[n][n];
        int[][] diff_matrix = new int[n][n];
        
        System.out.println("Enter the elements of matrix1:");
        for(int i=0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print("a["+(i+1)+"]["+(j+1)+"] = ");
                matrix1[i][j] = sc.nextInt();
            }            
        }
        System.out.println("Enter the elements of matrix2:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("b["+(i+1)+"]["+(j+1)+"] = ");
                matrix2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" "+matrix1[i][j]);
            }
            System.out.println();
        }
        System.out.println("Matrix 2");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" "+matrix2[i][j]);
            }
            System.out.println();
        }
        
        for(int i=0;i<n;i++){
           for(int j = 0;j<n;j++){
            Add_matrix[i][j]=matrix1[i][j] + matrix2[i][j];
           }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                diff_matrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        System.out.println("\nAddition_matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(Add_matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nDifference_Matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(diff_matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}