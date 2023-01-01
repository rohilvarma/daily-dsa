package recursion_and_backtracking.recursion_in_arrays;

import java.util.Scanner;

public class MaxOfAnArray {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }   
        System.out.println(maxOfArray(arr, n-1));
        sc.close();
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx==0) {
            return arr[idx];
        }
        return Math.max(arr[idx], maxOfArray(arr, idx-1));
    }
}
