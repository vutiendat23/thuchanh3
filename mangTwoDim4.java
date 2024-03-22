// nhap mot ma tran vuong co cac so nguyen tu ban phim 
// thay the phan tu duoi duong cheo chinh bang 0
//in ma tran do ra man hinh
import java.util.Scanner;

public class mangTwoDim4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        do {
            System.out.println("Nhap n:");
            n = sc.nextInt();
        } while(n <= 0);
        int[][] arr = new int[n][n];
        inputMatrix(arr, sc);
        printMatrix(arr);
        System.out.println("Matran thay the la:");
        printMatrix(thayThe(arr));

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
    // thay the phan tu duoi duong cheo chinh bang 0
    public static int[][] thayThe(int[][] matrix) {
        for(int i = 0; i < matrix[0].length - 1; i++) {
            for(int j = i + 1; j < matrix.length; j++) {
                if(matrix[j][i] != 0) {
                    matrix[j][i] = 0;
                }
            }
            
        }
        return matrix;
    }

}