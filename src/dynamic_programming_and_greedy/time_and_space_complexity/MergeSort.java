package dynamic_programming_and_greedy.time_and_space_complexity;
import java.util.*;

public class MergeSort {
    public static int[] mergeSort(int[] arr, int lo, int hi) {
        if(lo == hi) {
            int[] baseArray = new int[1];
            baseArray[0] = arr[lo];
            return baseArray;
        }
        int mid = (lo+hi)/2;
        int[] firstSortedHalf = mergeSort(arr, lo, mid);
        int[] secondSortedHalf = mergeSort(arr, mid+1, hi);
        int[] sortedArray = merge(firstSortedHalf, secondSortedHalf);
        return sortedArray;

    }
    public static int[] merge(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        int i=0;
        int j=0;
        for(int k=0 ; k<res.length ; k++) {
            if(i<a.length && j<b.length) {
                if(a[i]<b[j]) {
                    res[k] = a[i];
                    i++;
                }
                else {
                    res[k] = b[j];
                    j++;
                }
            }
            else if(i==a.length) {
                res[k] = b[j];
                j++;
            }
            else {
                res[k] = a[i];
                i++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = mergeSort(arr, 0, n-1);
        System.out.println(Arrays.toString(res));
        sc.close();
    }
}