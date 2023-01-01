package basics_of_programming.getting_started;
import java.util.*;

/**
 * RotateANumber
 */
public class RotateANumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String num = n + "";
        int count = num.length();
        k = count<Math.abs(k) ? k%count : k;
        k = k<0 ? count+k : k;
        int temp = n%(int)Math.pow(10,k);
        n/=(int)Math.pow(10,k);
        System.out.println(temp*(int)Math.pow(10, count-k)+n);

        sc.close();
    }
}
