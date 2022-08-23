package patterns;

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++) {
            System.out.print("*\t");
            int count = Math.min(i,n-i-1);
            for(int j=1 ; j<=n-2 ; j++) {
                if(i<n/2) {
                    System.out.print("\t");
                }
                else {
                    if(j==count || j==n-count-1) {
                        System.out.print("*\t");
                    }
                    else {
                        System.out.print("\t");
                    }
                }
            }
            if(n!=1) {
                System.out.print("*\n");
            }
        }
        sc.close();
    }
}
