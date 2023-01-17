package recursion_and_backtracking.recursion_backtracking;

import java.util.Scanner;

public class NQueens {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] chessBoard = new int[n][n];
        printNQueens(chessBoard, "", 0);
        sc.close();
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        if(row==chess.length) {
            System.out.println(qsf + ".");
            return;
        }
        for(int i=0 ; i<chess.length ; i++) {
            if(isSafePlace(chess, row, i)) {
                chess[row][i] = 1;
                printNQueens(chess, qsf + row + "-" + i + ", ", row+1);
                chess[row][i] = 0;
            }
        }
    }
    public static boolean isSafePlace(int[][] arr, int r, int c) {
        for(int i=r-1 ; i>=0 ; i--) {
            if(arr[i][c]==1) {
                return false;
            }
        }
        for(int i=r-1, j=c-1 ; i>=0 && j>=0 ; i--, j--) {
            if(arr[i][j]==1) {
                return false;
            }
        }
        for(int i=r-1, j=c+1 ; i>=0 && j<arr.length ; i--, j++) {
            if(arr[i][j]==1) {
                return false;
            }
        }
        return true;
    }
    
}
