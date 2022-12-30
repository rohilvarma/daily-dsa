package introduction_to_recursion;

import java.util.Scanner;

public class PrintIncreasingDecreasing {
    public static void pdi(int n) {
        if(n==0) {
            return;
        }
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pdi(n);
        sc.close();
    }
}
