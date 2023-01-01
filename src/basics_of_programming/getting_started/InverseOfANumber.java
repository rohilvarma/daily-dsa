package basics_of_programming.getting_started;
import java.util.*;

/**
 * InverseOfANumber
 */
public class InverseOfANumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int index = 1;
        int newNum = 0;
        while(n!=0) {
            newNum += (int)Math.pow(10,n%10-1)*index;
            index++;
            n/=10;
        }
        System.out.println(newNum);

        sc.close();
    }
}