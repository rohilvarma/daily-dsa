package two_d_arrays;

import java.util.Scanner;

public class SaddlePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0 ; i<n ; i++) {
            int min_i = 0;
            for(int j=0 ; j<n ; j++) {
                if(arr[i][min_i]>arr[i][j]) {
                    min_i = j;
                }
            }
            boolean flag = true;
            for(int j=0 ; j<n ; j++) {
                if(arr[i][min_i]<arr[j][min_i]) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.println(arr[i][min_i]);
                return;
            }

        }
        System.out.println("Invalid input");

        sc.close();
    }
}
