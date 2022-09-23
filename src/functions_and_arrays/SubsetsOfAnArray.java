package functions_and_arrays;

import java.util.Scanner;

public class SubsetsOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0 ; i<(int)Math.pow(2, arr.length) ; i++) {
            int indexCounter = arr.length-1;
            int temp = i;
            String res = "";
            int index = 0;
            while(index<arr.length) {
                if(temp%2==1) {
                    res = arr[indexCounter] + "\t" + res;
                }
                else {
                    res = "-\t" + res;
                }
                indexCounter--;
                temp/=2;
                index++;
            }
            System.out.println(res);
        }
        sc.close();
    }
}
