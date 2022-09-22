package functions_and_arrays;

import java.util.Scanner;

public class FirstIndexAndLastIndex {
	public static void getFirstIndexLastIndex(int[] arr, int data, boolean getFirstIndex) {
        int l = 0;
        int h = arr.length;
        while(l<=h) {
            int m = (l+h)/2;
            if(arr[m]>data) {
                h = m-1;
            }
            else if(arr[m]<data) {
                l = m+1;
            }
            else {
                if(!getFirstIndex) {
                    if(m<arr.length-1 && arr[m+1]==data) {
                        l = m+1;
                    }
                    else {
                        System.out.println(m);
                        return ;
                    }
                }
                else {
                    if(m>0 && arr[m-1]==data) {
                        h = m-1;
                    }
                    else {
                        System.out.println(m);
                        return ;
                    }
                }
            }
        }
        System.out.println(-1);
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int data = sc.nextInt();
        getFirstIndexLastIndex(arr, data, true);
        getFirstIndexLastIndex(arr, data, false);
        sc.close();
    }
}
