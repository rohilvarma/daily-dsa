package functions_and_arrays;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static int convertToBaseB(int n, int b) {
        int count = 0;
        int newNum = 0;
        while(n!=0) {
            System.out.println(n%b + ", " + n/b);
            newNum += (n%b)*(int)Math.pow(10,count);
            n/=b;
            count++;
        }
        return newNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(convertToBaseB(n, b));
        sc.close();
    }
}
