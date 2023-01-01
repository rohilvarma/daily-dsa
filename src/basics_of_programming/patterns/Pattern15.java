package basics_of_programming.patterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        for(int i=0 ; i<n ; i++) {
            int count = i>n/2 ? n-i : i+1;
            for(int j=0 ; j<Math.abs(i-n/2) ; j++) {
                System.out.print("\t");
            }
            for(int j=0 ; j<counter ; j++) {
                System.out.print(count + "\t");
                count = j>=counter/2 ? count-1 : count+1;
            }
            counter = i>=n/2 ? counter-2 : counter+2;
            System.out.println("");
        }
        sc.close();
    }
}
