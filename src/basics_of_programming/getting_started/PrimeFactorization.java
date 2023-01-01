package basics_of_programming.getting_started;
import java.util.*;

/**
 * PrimeFactorization
 */
public class PrimeFactorization {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div = 2;
        while(n!=1) {
            if(n%div==0) {
                System.out.print(div + " ");
                n/=div;
            }
            else {
                div++;
            }
        }
        sc.close();
    }
}