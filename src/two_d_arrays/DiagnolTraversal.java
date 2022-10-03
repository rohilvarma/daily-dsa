package two_d_arrays;
import java.util.Scanner;
public class DiagnolTraversal {
	public static void diagnolTraversal(int[][] arr, int n) {
		int index = 0;
		while(index<=n) {
			for(int i=0, j=index ; i<n-index ; i++, j++) {
				System.out.println(arr[i][j]);
			}
			index++;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<n ; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		diagnolTraversal(arr, n);
		sc.close();
	}
}
