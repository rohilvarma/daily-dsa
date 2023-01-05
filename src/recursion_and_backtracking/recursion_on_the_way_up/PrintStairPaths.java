package recursion_and_backtracking.recursion_on_the_way_up;

import java.util.Scanner;

public class PrintStairPaths {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStairPaths(n, "");
        sc.close();
    }

    public static void printStairPaths(int n, String path) {
        if(n==0) {
            System.out.println(path);
            return;
        }
        for(int i=1 ; i<=Math.min(3,n) ; i++) {
            printStairPaths(n-i, path+i);
        }
    }
}
