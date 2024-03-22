// tim gia tri lon nhat trong ma tran so thuc duoc nhap tu ban phim va in ra man hinh
import java.util.Scanner;

public class mangTwoDim2 {
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
        System.out.println("Gia tri lon nhat cua ma tran la: " + numberMaxMatrix(arr));
    }

    // nhap ma tran
    public static void inputMatrix(double[][] matrix, Scanner sc) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }
    }

    // in ma tran
    public static void printMatrix(double[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    // tim gia tri lon nhat cua ma tran
    public static double numberMaxMatrix(double[][] matrix) {
        double max = matrix[0][0];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
    

}