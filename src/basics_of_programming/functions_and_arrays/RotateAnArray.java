package basics_of_programming.functions_and_arrays;
import java.io.*;

public class RotateAnArray {
   public static void display(int[] a){
       StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }
	public static void reverse(int[] arr, int start, int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void rotate(int[] a, int k) {
		k %= a.length;
		if(k<0) {
			k = a.length+k;
		}
        if(k==0) {
            return ;
        }   
		reverse(a, 0, a.length-k-1);
        reverse(a, a.length-k, a.length-1);
        reverse(a, 0, a.length-1);

	}

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        System.out.println("################");
        rotate(a, k);
        display(a);
    }
}
