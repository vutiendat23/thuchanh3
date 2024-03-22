// kiem tra xem ma tran so nguyen nhap tu ban phim co phai la ma tran vuong hay khong
// in ra man hinh true hoac false
import java.util.Scanner;

public class mangTwoDim5 {
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
    // kiem tra ma tran co phai la ma tran vuong hay khong
    public static boolean kiemTraMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        return rows == columns;
    }

}