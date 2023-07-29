package dynamic_programming_and_greedy.time_and_space_complexity;
import java.util.*;

public class MergeTwoSortedArrays {
    public static int[] mergeTwoSortedArrays(int[] a, int[] b){
        int[] res = new int[a.length+b.length];
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
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for(int i=0 ; i<n1 ; i++) {
            a1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for(int i=0 ; i<n2 ; i++) {
            a2[i] = sc.nextInt();
        }
        int[] ans = mergeTwoSortedArrays(a1, a2);
        System.out.println(Arrays.toString(ans));
        sc.close();
    }
}
