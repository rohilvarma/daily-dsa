package recursion_in_arrays;

import java.util.Scanner;

public class FirstIndex {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int res = firstIndex(arr, 0, x);
        System.out.println(res);
        sc.close();
    }

    public static int firstIndex(int[] arr, int idx, int x) {
        if(idx==arr.length-1) {
            return arr[idx]==x ? idx : -1;
        }
        return arr[idx]==x ? idx : firstIndex(arr, idx+1, x);
    }
}
