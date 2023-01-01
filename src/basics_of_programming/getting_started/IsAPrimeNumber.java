package basics_of_programming.getting_started;

import java.util.*;

public class IsAPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            String res = "prime";
            for(int i=2 ; i*i<=n ; i++) {
                if(n%i==0) {
                    res = "not prime";
                    break;
                }
            }
            System.out.println(res);
        }
        sc.close();
    }
}
