package two_d_arrays;

import java.util.Scanner;

public class ExitPointOfAMatrix {
    public static void getExitPoint(int[][] arr, int n, int m) {
        int count = 0;
        int i=0;
        int j=0;
        while(true) {
            if(i<0 || i>=n || j<0 || j>=m) {
                if(i<0 || i>=n) {
                    i = i<0 ? 0 : n-1;
                }
                else {
                    j = j<0 ? 0 : m-1;
                }
                System.out.println(i + "\n" + j);
                return ;
            }
            if(arr[i][j]==1) {
                count++;
                count%=4;
            }
            switch(count) {
                case 0:
                    i++;
                    break;
                case 1:
                    j++;
                    break;
                case 2:
                    i--;
                    break;
                case 3:
                    j--;
                    break;
                default:
                    break;
            }
        }
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
        getExitPoint(arr, n, m);
        sc.close();
    }
}
