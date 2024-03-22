//  Dùng thuật toán sàng Eratosthene( sàng số nguyên tố) rồi in ra tất cả các số nguyên tố trong [a,b] 
// với a,b là số thực được nhập từ bàn phím 
import java.util.Scanner;

public class mangTwoDim7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        double a, b;
        do {
            System.out.println("Nhap so hang:");
            n = sc.nextInt();
            System.out.println("Nhap so cot:");
            m = sc.nextInt();
            System.out.println("Nhap so thuc a:");
            a = sc.nextDouble();
            System.out.println("Nhap so thuc b:");
            b = sc.nextDouble();
        } while(n <= 0 || m <= 0 );
        double[][] arr = new double[n][m];
        inputMatrix(arr, sc);
        printMatrix(arr);
        System.out.println("");
        findNumberIsPrime(a,b,arr);
        
    }
    public static void inputMatrix(double[][] matrix, Scanner sc) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }
    }
    public static void printMatrix(double[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    // tim cac so nguyen to trong ma tran A thuoc doan [a,b]
    public static void findNumberIsPrime(double a, double b, double[][] matrix) {
        boolean[] isPrime = new boolean[(int)b + 1];
        for (int i = 2; i <= b; i++) {
            isPrime[i] = true;
        }

        for (int j = 2; j * j <= b; j++) {
            if (isPrime[j]) {
                for (int i = j * j; i <= b; i += j) {
                    isPrime[j] = false;
                }
            }
        }
        System.out.println("Cac so nguyen to trong [" + a + "," + b +"]");
        for(int m = Math.max(2,(int)a); m <= b; m++) {
            if(isPrime[m]) {
                System.out.print(m + " ");
            }
        }
        System.out.println("");
        for(int d = 0; d < matrix.length; d++) {
            for(int h = 0; h < matrix[d].length; h++) {
                double g = matrix[d][h];
                if(matrix[d][h] >= a && matrix[d][h] <= b && isPrime[(int)g]) {
                    System.out.print(matrix[d][h]);
                }
            }
           
        }
        


    }


    

}