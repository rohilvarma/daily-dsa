package functions_and_arrays;

import java.util.Scanner;

public class FindAnElementInArray {
    public static int findIndex(int[] arr, int f) {
        for(int i=0 ; i<arr.length ; i++) {
            if(arr[i]==f) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }
        int f = sc.nextInt();
        System.out.println(findIndex(arr, f));
        sc.close();
    }
}
