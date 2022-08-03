package getting_started;
import java.util.*;

/**
 * DigitsOfANumber
 */
public class DigitsOfANumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        // String Approach
        String num = n + "";
        for(int i=0 ; i<num.length() ; i++) {
            System.out.println(num.charAt(i));
        }

        sc.close();
    }
}