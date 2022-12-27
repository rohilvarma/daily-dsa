package getting_started;
import java.util.*;

/**
 * DigitsOfANumber
 */
public class DigitsOfANumber {
    public static int countN(int n) {
        int count = 0;
        while(n!=0) {
            n/=10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        // String Approach
        String num = n + "";
        for(int i=0 ; i<num.length() ; i++) {
            System.out.println(num.charAt(i));
        }

        // Counting the Digits approach
        int count = countN(n);
        int div = (int)Math.pow(10,count-1);
        while(n!=0) {
            System.out.println(n/div);
            n%=div;
            div/=10;
        }
        while(div!=0) {
            System.out.println(0);
            div/=10;
        }

        sc.close();
    }
}