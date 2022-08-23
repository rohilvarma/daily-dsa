package patterns;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n/2;
        int b = a;
        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<=Math.max(a,b) ; j++) {
                if(j==a || j==b) {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            a = i>=n/2 ? a+1 : a-1;
            b = i>=n/2 ? b-1 : b+1;
            System.out.println("");
        }
        sc.close();
    }
}
