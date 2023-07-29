package dynamic_programming_and_greedy.time_and_space_complexity;
import java.util.*;

public class SelectionSort {
    public static void display(int arr[]) {
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr) {
        for(int i=0 ; i<arr.length-1 ; i++) {
            int minIndex = i;
            for(int j=i+1 ; j<arr.length ; j++) {
                if(arr[j]<arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            // display(arr);
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
        selectionSort(arr);
        display(arr);
        sc.close();
    }
}