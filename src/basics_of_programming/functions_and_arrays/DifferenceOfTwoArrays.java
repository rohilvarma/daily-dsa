package basics_of_programming.functions_and_arrays;

import java.util.Scanner;

public class DifferenceOfTwoArrays {
    public static void differenceOfArrays(int[] a1, int[] a2) {
        int i = a1.length-1;
        int j = a2.length-1;
        int carry = 0;
        String res = "";
        while(j>=0) {
            int diff = 0;
            int a1v = i>=0 ? a1[i] : 0;
            if(a2[j]+carry>= a1v) {
                diff = a2[j]-a1v+carry;
                carry = 0;
            }
            else {
                diff = a2[j] - a1v + 10 + carry;
                carry = -1;
            }
            res = diff + res;
            j--;
            i--;
        }
        i = 0;
        while(i<res.length()) {
            if(res.charAt(i)!='0') {
                break;
            }
            i++;
        }
        while(i<res.length()) {
            System.out.println(res.charAt(i));
            i++;
        }
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
        differenceOfArrays(a1, a2);
        sc.close();
    }
}
