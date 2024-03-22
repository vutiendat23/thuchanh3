// sắp xếp các mảng số nguyên từ bàn phím theo thứ tự giảm dần và in mảng đó ra màn hình 
import java.util.Scanner;
public class mangdim6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
        } while(n <= 0);
        int[] arr = new int[n];
        inputMatrix(arr, sc);
        printMatrix(arrange(arr));
        
    }

    public static void inputMatrix(int[] matrix, Scanner sc) {
        for(int i = 0; i < matrix.length; i++) {
            matrix[i] = sc.nextInt();
        }
    }

    // sawps xep cac mang theo thu tu giam dan
    public static int[] arrange(int[] matrix) {
        int i = 0;
        int result;
        while(i < matrix.length -1) {
            for(int j = i + 1; j < matrix.length; j++) {
                if(matrix[i] < matrix[j]) {
                    result = matrix[i];
                    matrix[i] = matrix[j];
                    matrix[j] = result;
                }
            }
            i++;
        }
        return matrix;
    }
    public static void printMatrix(int[] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i] + " ");
        }
    }
}