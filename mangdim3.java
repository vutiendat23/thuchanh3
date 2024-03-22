//in ra tong caca phan tu cac so thu torng mang dduoc nhap tu ban phim 
import java.util.Scanner;

public class mangdim3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n = sc.nextInt();
        } while(n <= 0);
        double[] arr = new double[n];
        inputMatrix(arr, sc);
        printMatrix(arr);
        summaxMatrix(arr);
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
    // in ra tong lon nhaat trong mang
    public static void summaxMatrix(double[] arr) {
        double a = arr[0];
        double sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Tong cac phan tu trong mang la: " + sum);
    }
}
