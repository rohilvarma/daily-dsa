package patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0 ; i<n; i++) {
            for(int j=0 ; j<n/2 ; j++) {
                if(i==n/2) {
                    System.out.print("*\t");
                }
                else {   
                    System.out.print("\t");
                }
            }
            for(int j=0 ; j<=Math.min(i, n-i-1) ; j++) {
                System.out.print("*\t");
            }
            System.out.println("");
        }
        sc.close();
    }
}
