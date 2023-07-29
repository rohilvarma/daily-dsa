package dynamic_programming_and_greedy.time_and_space_complexity;
import java.util.*;

public class InsertionSort {
    public static void display(int arr[]) {
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr) {
        for(int i=0 ; i<arr.length-1 ; i++) {
            for(int j=i ; j>=0 ; j--) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                else {
                    break;
                }
                display(arr);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }
        display(arr);
        insertionSort(arr);
        display(arr);
        sc.close();
    }
}