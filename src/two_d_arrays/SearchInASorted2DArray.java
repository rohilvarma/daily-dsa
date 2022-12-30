package two_d_arrays;

import java.util.Scanner;

public class SearchInASorted2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<n ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        sc.close();
        
        int row = -1;
        for(int i=0 ; i<n ; i++) {
            if(arr[i][n-1]>x) {
                row = i;
                break;
            }
            else if(arr[i][n-1]==x) {
                System.out.println(i + "\n" + (n-1));
                return;
            }
        }
        int l = 0;
        int h = n-1;
        while(l<=h) {
            int m = (l+h)/2;
            if(arr[row][m]<x) {
                l = m+1;
            }
            else if(arr[row][m]>x) {
                h = m-1;
            }
            else {
                System.out.println(row + "\n" + m);
                return;
            }
        }
        System.out.println("Not Found");

    }
}
