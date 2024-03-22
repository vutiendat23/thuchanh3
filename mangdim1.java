// nhap mot mang so nguyen to va in no ra man hinh
import java.util.Scanner;

public class mangdim1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
        } while(n <= 0);
        int[] arr = new int[n];
        inputMatrix(arr, sc);
        printMatrix(arr);
        numbermaxMatrix(arr);
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
    // in ra so lon nhaat trong mang
    public static void numbermaxMatrix(int[] arr) {
        int a = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(a < arr[i]) {
                a = arr[i];
            }   
        }
        System.out.println("So lon nhat cua ma tran la: " + a);
    }
}