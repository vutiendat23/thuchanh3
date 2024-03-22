// in ra ma tran chuyen vi cua ma tran so thuc nhap tu ban phim 
import java.util.Scanner;

public class mangTwoDim8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        do {
            System.out.println("Nhap so hang:");
            n = sc.nextInt();
            System.out.println("Nhap so cot:");
            m = sc.nextInt();
        } while(n <= 0 || m <= 0);
        double[][] arr = new double[n][m];
        inputMatrix(arr, sc);
        printMatrix(arr);
        System.out.println("Ma tran chuyen vi:");
        printMatrix(matrixChuyenVi(arr));
    }
    public static void inputMatrix(double[][] matrix, Scanner sc) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }
    }
    public static void printMatrix(double[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }


    // ma tran chuyen vi 
    public static double[][] matrixChuyenVi(double[][] matrix) {
        double[][] matrix1 = new double[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix1.length; i++) {
            for(int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = matrix[j][i];
            }
        }
        return matrix1;
    }

}