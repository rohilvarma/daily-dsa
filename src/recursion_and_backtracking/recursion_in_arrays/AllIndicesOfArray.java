package recursion_and_backtracking.recursion_in_arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AllIndicesOfArray {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        // write ur code here
        if(idx==arr.length) {
            return new int[0];
        }
        int[] count = allIndices(arr, x, idx+1, arr[idx]==x ? fsf+1 : fsf);
        if(arr[idx]==x) {
            int[] res = new int[count.length+1];
            res[0] = idx;
            for(int i=1 ; i<res.length ; i++) {
                res[i] = count[i-1];
            }
            return res;
        }
        return count;
        
        // This a more optimal approach that basically increases the count all the way till the end of the array and then initializes an array of length of that count and then returns that array. If the current index value corresponds to x then in that case it fills the array at index fsf, because the order of finding the element is basically the same as the index of the array.

        // if(idx==arr.length) {
        //     return new int[fsf];
        // }
        // if(arr[idx]==x) {
        //     int[] count = allIndices(arr, x, idx+1, fsf+1);
        //     count[fsf] = idx;
        //     return count;
        // }
        // else {
        //     int[] count = allIndices(arr, x, idx+1, fsf);
        //     return count;
        // }
    }
}
