package basics_of_programming.getting_started;
import java.util.*;
import java.lang.Math;

/**
 * GcdAndLcm
 */
public class GcdAndLcm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm = 1;
        int gcd = 1;
        int div = 2;
        int maxAB = Math.max(a, b);
        while(a!=1 || b!=1 && div*div<=maxAB) {
            if(a%div==0 && b%div==0) {
                gcd *= div;
            }
            if(a%div==0 || b%div==0) {
                a = a%div==0 ? a/div : a;
                b = b%div==0 ? b/div : b;
                lcm*=div;
            }
            else {
                div++;
            }
        }
        System.out.println(gcd);
        System.out.println(lcm);
        sc.close();
    }
}