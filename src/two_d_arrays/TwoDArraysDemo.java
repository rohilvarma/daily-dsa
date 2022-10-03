package two_d_arrays;

import java.util.Scanner;

public class TwoDArraysDemo {
    public static void display(int[][] arr) {
        for(int i=0 ; i<arr.length ; i++) {
            for(int j=0 ; j<arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<m ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        display(arr);
        sc.close();
    }
}
