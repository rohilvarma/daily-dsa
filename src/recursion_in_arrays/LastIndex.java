package recursion_in_arrays;

import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int res = lastIndex(arr, n-1, x);
        System.out.println(res);
        sc.close();
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx==0) {
            return arr[idx]==x ? idx : -1;
        }
        return arr[idx]==x ? idx : lastIndex(arr, idx-1, x);
    }
}
