package functions_and_arrays;

import java.util.Scanner;

public class BarChart {
    public static void printBar(int[] arr, int max) {
        for(int i=0 ; i<max ; i++) {
            for(int j=0 ; j<arr.length ; j++) {
                if(max-arr[j]<=i) {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(arr[i], max);
        }
        printBar(arr, max);
        sc.close();
    }
}
