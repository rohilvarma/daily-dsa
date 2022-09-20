package functions_and_arrays;

import java.util.Scanner;

public class SumOfTwoArrays {
    public static void sumOfArrays(int[] arr1, int[] arr2) {
        int i = arr1.length-1;
        int j = arr2.length-1;
        int carry = 0;
        String res = "";
        while(i>=0 || j>=0) {
            int temp = carry;
            if(i>=0) {
                temp += arr1[i];
            }
            if(j>=0) {
                temp += arr2[j];
            }
            carry = temp/10;
            temp %= 10;
            System.out.println("temp: " + temp + " carry: " + carry);
            res = temp + res;
            i--;
            j--;
        }
        if(carry!=0) {
            res = carry + res;
        }
        for(char c : res.toCharArray()) {
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0 ; i<n1 ; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0 ; i<n2 ; i++) {
            arr2[i] = sc.nextInt();
        }
        sumOfArrays(arr1, arr2);
        sc.close();
    }
}
