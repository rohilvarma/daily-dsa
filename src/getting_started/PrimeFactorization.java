package getting_started;
import java.util.*;

/**
 * PrimeFactorization
 */
public class PrimeFactorization {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int originalN = n;
        int div = 2;
        while(n!=1 && div*div<=originalN) {
            if(n%div==0) {
                System.out.println(div);
                n/=div;
            }
            else {
                div++;
            }
        }
        sc.close();
    }
}