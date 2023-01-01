package basics_of_programming.two_d_arrays;

import java.util.Scanner;

public class MatrixMultiplication {
    public static int[][] product(int[][] a1, int[][] a2, int n, int m, int c) {
        int[][] arr = new int[n][m];
        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<m ; j++) {
                int prd = 0;
                for(int k=0 ; k<c ; k++) {
                    prd += a1[i][k]*a2[k][j];
                }
                arr[i][j] = prd;
            }
        }
        return arr;
    }
    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        int[][] a1 = new int[n1][m1];
        for(int i=0 ; i<n1 ; i++) {
            for(int j=0 ; j<m1 ; j++) {
                a1[i][j] = sc.nextInt();
            }
        }

        int n2 = sc.nextInt();
        int m2 = sc.nextInt();
        int[][] a2 = new int[n2][m2];
        for(int i=0 ; i<n2 ; i++) {
            for(int j=0 ; j<m2 ; j++) {
                a2[i][j] = sc.nextInt();
            }
        }

        if(m1!=n2) {
            System.out.println("Invalid input");
        }
        else {
            int[][] res = product(a1, a2, n1, m2, m1);
            display(res);
        }
        sc.close();
    }
}
