package two_d_arrays;

import java.util.Scanner;

public class RotateBy90Degrees {
	public static void rotate(int[][] arr, int n, int m) {
		transpose(arr, n, m);
		for(int i=0 ; i<n ; i++) {
			int start = 0;
			int end = m-1;
			while(start<=end) {
				int temp = arr[i][start];
				arr[i][start] = arr[i][end];
				arr[i][end] = temp;
				start++;
				end--;
			}
		}
	}
	public static void transpose(int[][] arr, int n, int m) {
		for(int i=0 ; i<n ; i++) {
			for(int j=i+1 ; j<n ; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
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

		rotate(arr, n, m);
		display(arr);
		sc.close();
	}
	public static void display(int[][] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
