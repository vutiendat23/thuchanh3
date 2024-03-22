//tim cot co tong lon thu 2 trong ma tran so thuc va in chi so cot do ra man hinh
import java.util.Scanner;

public class mangTwoDim3 {
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
        printSumColumn2(sumColumns(arr));
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

    // tim cot co tong lon thu 2 va in ra man hinh chi so cot
    public static void printSumColumn2 (double[] matrix) {
        double max1 = matrix[0];
        double b = 0;
        for(int i = 0; i < matrix.length; i++) {
            if(max1 > matrix[i]) {
                b = max1;
                max1 = matrix[i];
            } else if(matrix[i] > b && max1 != matrix[i]) {
                b = matrix[i];
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            if(b == matrix[i]) {
                System.out.println("Chi so cua cot co tong lon thu 2 la: " + i);
            }
        }
    }

    
    public static double[] sumColumns(double[][] matrix) {
        double[] arr = new double[matrix[0].length];
        double sum = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            arr[i] = sum;
            sum = 0;
        }
        return arr;
    }
    
}