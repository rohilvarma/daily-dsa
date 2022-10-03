package two_d_arrays;

import java.util.Scanner;

public class SpiralTraversal {
    public static void spiralTraversal(int[][] arr, int n, int m) {
        int i=0;
        int j=0;
        int dir = 0;
        while((i>=0 && i<n) && (j>=0 && j<m)) {
            if(arr[i][j]==1) {
                dir++;
                dir%=4;
            }
            switch(dir) {
                case 0:
                    j++;
                    break;
                case 1:
                    i++;
                    break;
                case 2:
                    j--;
                    break;
                case 3:
                    i--;
                    break;
            }
        }
        i = i<0 ? 0 : i==n ? n-1 : i;
        j = j<0 ? 0 : j==m ? m-1 : j;
        System.out.println(i + "\n" + j);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        spiralTraversal(arr, n, m);
        sc.close();
    }
}
