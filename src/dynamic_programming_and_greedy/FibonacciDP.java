package dynamic_programming_and_greedy;

import java.util.Scanner;

public class FibonacciDP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fibMemoization(n, new int[n+1]));
        sc.close();
    }

    public static int fibMemoization(int n, int[] qb) {
        if(n==0 || n==1) {
            return n;
        }
        if(qb[n]!=0) {
            return qb[n];
        }

        int fibn =  fibMemoization(n-1, qb) + fibMemoization(n-2, qb);
        qb[n] = fibn;
        return fibn;
    }
}