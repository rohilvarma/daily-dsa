package functions_and_arrays;
import java.util.*;
public class AnyBaseAddition {
    public static int convertToDecimal(int b, int n) {
        int count = 0;
        int dec = 0;
        while(n!=0) {
            int r = n%10;
            n/=10;
            dec+=r*(int)Math.pow(b, count);
            count++;
        }
        return dec;
    }
    public static int convertToB(int b, int n) {
        int count = 0;
        int res = 0;
        while(n!=0) {
            int r = n%b;
            n/=b;
            res += r*(int)Math.pow(10, count);
            count++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(convertToB(b, convertToDecimal(b, n1) + convertToDecimal(b, n2)));
        sc.close();
    }
}
