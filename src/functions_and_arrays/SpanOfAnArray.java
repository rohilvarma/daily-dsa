package functions_and_arrays;

import java.util.Scanner;

public class SpanOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i:arr) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        System.out.println(max-min);
        sc.close();
    }
}
