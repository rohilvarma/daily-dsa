package basics_of_programming.functions_and_arrays;

import java.util.Scanner;

public class BrokenEconomy {
    public static void getCeilFloor(int[] arr, int data) {
        int l = 0;
        int h = arr.length;
        while (l <= h) {
            int m = (l + h) / 2;
            if (arr[m] < data) {
                l = m + 1;
            } else if (arr[m] > data) {
                h = m - 1;
            } else {
                System.out.print(arr[m + 1] + "\n" + arr[m - 1]);
                return;
            }
        }
        if (arr[l] > data) {
            System.out.print(arr[l] + "\n" + arr[l - 1]);
        } else {
            System.out.print(arr[l + 1] + "\n" + arr[l]);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int data = sc.nextInt();

        getCeilFloor(arr, data);

        sc.close();
    }
}
