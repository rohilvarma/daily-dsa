package functions_and_arrays;

import java.util.Scanner;

public class AnyBaseToDecimal {
    public static int convertToDecimal(int n, int b) {
        int count = 0;
        int decimalNum = 0;
        while(n!=0) {
            int r = n%10;
            decimalNum += (int)Math.pow(b,count)*r;
            n/=10;
            count++;
        }
        return decimalNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(convertToDecimal(n,b));
        sc.close();
    }
}
