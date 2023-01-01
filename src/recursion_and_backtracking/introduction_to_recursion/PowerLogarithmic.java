package recursion_and_backtracking.introduction_to_recursion;

import java.util.Scanner;

public class PowerLogarithmic {
    public static int power(int x, int n) {
        if(n==0) {
            return 1;
        }
        int nb2 = power(x, n/2);
        return n%2==0 ? nb2*nb2 : nb2*nb2*x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x,n));
        sc.close();
    }
}
