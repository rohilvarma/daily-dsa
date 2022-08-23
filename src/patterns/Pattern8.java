package patterns;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n ; i>0 ; i--) {
            for(int j=i-1 ; j>0 ; j--) {
                System.out.print("\t");
            }
            System.out.print("*\n");
        }
        sc.close();
    }
}
