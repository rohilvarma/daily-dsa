package basics_of_programming.functions_and_arrays;

import java.util.Scanner;

public class DigitsFrequency {
    public static int digitsFrequency(int n, int d) {
        int count = 0;
        while(n!=0) {
            if(n%10==d) {
                count++;
            }
            n/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        System.out.print(digitsFrequency(n,d));
        sc.close();
    }
}
