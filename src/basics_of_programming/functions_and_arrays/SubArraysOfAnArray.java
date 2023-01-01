package basics_of_programming.functions_and_arrays;

import java.util.Scanner;

public class SubArraysOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int end = 0;
        while(start<arr.length-1) {
            if(end==arr.length) {
                start++;
                end = start;
            }
            for(int i=start ; i<=end ; i++) {
                System.out.print(arr[i] + "\t");
            }
            end++;
            System.out.println("");
        }
        sc.close();
    }
}
