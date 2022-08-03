package getting_started;
import java.util.*;

public class CountDigitsInANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // 1. String Approach
        String num = n + "";
        System.out.println(num.length());

        // 2. While loop Approach
        int count = 0;
        while(n-->0) {
            n/=10;
            count++;
        }
        System.out.println(count);

        sc.close();
    }
}