// in ra so nhỏ thứ n trong mảng số nguyên dược nhập từ bàn phím 
import java.util.Scanner;

public class mangdim4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
        } while(n <= 0);
        int[] arr = new int[n];
        inputMatrix(arr, sc);
        printMatrix(arr);
        System.out.println("Nhap vao mot so b vat ki");
        int b = sc.nextInt();
        System.out.println("So nho thu " + b + " trong mang la:");
        sapXep(arr, b);
        
    }

    public static void inputMatrix(int[] arr, Scanner sc) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void printMatrix(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + " ");
        }
    }
    // in ra so nho thu n trong mang
    public static void numberMinStn(int[] matrix) {
        for(int i = 0; i < matrix.length; i++) {

        }
    }
    
    public static void sapXep(int[] matrix, int n) {
        int m;
        int i = 0;
        while(i < matrix.length - 1) {
            for(int j =i + 1; j < matrix.length; j++) {
                if(matrix[i] > matrix[j]) {
                    m = matrix[i];
                    matrix[i] = matrix[j];
                    matrix[j] = m;
                }
            }
            i++;
        }
        
            if(n > matrix.length || n <= 0) {
                System.out.println("Khong co");
            } else {
                System.out.print(matrix[n - 1] );
            }
            
        
    }
    
}