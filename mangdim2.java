// in ra so lon nhat trong mang co so thuc nhap tu ban phim 
import java.util.Scanner;

public class mangdim2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
        } while(n <= 0);
        double[] arr = new double[n];
        inputMatrix(arr, sc);
        printMatrix(arr);
        numbermaxMatrix(arr);
    }

    public static void inputMatrix(double[] arr, Scanner sc) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }
    }

    public static void printMatrix(double[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + " ");
        }
    }
    // in ra so lon nhaat trong mang
    public static void numbermaxMatrix(double[] arr) {
        double a = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(a < arr[i]) {
                a = arr[i];
            }   
        }
        System.out.println("So lon nhat cua ma tran la: " + a);
    }
    
}
