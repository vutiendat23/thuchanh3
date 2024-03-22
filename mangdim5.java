// Kiểm tra mảng được nhập vào bàn phím có phải là một dãy tăng thật sự hay không, in ra màn hình true hoặc false
import java.util.Scanner;

public class mangdim5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
        } while(n <= 0);
        int[] arr = new int[n];
        inputMatrix(arr, sc);
        printMatrix(arr);
        if(dayTang(arr)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        
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
        System.out.println("");
    }
    
    // kiem tra mang co phai day tang that su hay khong
    public static boolean dayTang(int[] matrix) {
        for(int i = 0; i < matrix.length - 1; i++) {
            if(matrix[i] >= matrix[i + 1]) {
                return false;
            }
        }
        return true;
    }
    
}