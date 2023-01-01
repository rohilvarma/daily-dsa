package basics_of_programming.patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++) {
            int count = 1;
            for(int j=0 ; j<2*n-1 ; j++) {
                if(j<=i || j>=2*n-2-i) {
                    System.out.print(count + "\t");
                }
                else {
                    System.out.print("\t");
                }
                count = j>=n-1 ? count-1 : count+1;
            }
            System.out.println("");
        }
        sc.close();
    }
}
