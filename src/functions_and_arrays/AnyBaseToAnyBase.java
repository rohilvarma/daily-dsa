package functions_and_arrays;

import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static int convertToDecimal(int n ,int b) {
        int count = 0;
        int decimalNum = 0;
        while(n!=0) {
            int r = n%10;
            decimalNum += r*(int)Math.pow(b, count);
            n/=10;
            count++;
        }
        return decimalNum;
    }
    public static int decimalToAnyBase(int n, int b) {
        int count = 0;
        int newNum = 0;
        while(n!=0) {
            int r = n%b;
            newNum += r*(int)Math.pow(10, count);
            n/=b;
            count++;
        }
        return newNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        System.out.println(decimalToAnyBase(convertToDecimal(n, b1), b2));
        sc.close();
    }
}
