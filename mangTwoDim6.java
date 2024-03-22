// kiem tra xem ma tran so nguyen duoc nhap tu ban phim co phai la ma tran don vi hay khong
import java.util.Scanner;

public class mangTwoDim6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        do {
            System.out.println("Nhap so hang:");
            n = sc.nextInt();
            System.out.println("Nhap so cot:");
            m = sc.nextInt();
        } while(n <= 0 || m <= 0);
        int[][] arr = new int[n][m];
        inputMatrix(arr, sc);
        System.out.println("Matrix :");
        printMatrix(arr);
        if(kiemTraMatrix(arr)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    public static void inputMatrix(int[][] matrix, Scanner sc) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    public static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
    // kiem tra ma tran co phai la ma tran don vi hay khong
    public static boolean kiemTraMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        if(rows == columns && duongCheo(matrix)) {
            return true;
        }
        return false;
        
    }
    public static boolean duongCheo(int[][] matrix) {
        int i = 0;
        while(i < matrix.length) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(i == j && matrix[i][j] == 0) {
                    return false;
                }
                if(i != j && matrix[i][j] != 0) {
                    return false;
                }
            }
            i++;
        }
        return true;
    }
}