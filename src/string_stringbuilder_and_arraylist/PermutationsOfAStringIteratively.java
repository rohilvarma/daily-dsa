package string_stringbuilder_and_arraylist;

import java.util.Scanner;

public class PermutationsOfAStringIteratively {
    public static int getFactorial(int n) {
        int ans = 1;
        while(n!=0) {
            ans *= n;
            n--;
        }
        return ans;
    }
    public static void solution(String str){
        int fact = getFactorial(str.length());
        for(int i=0 ; i<fact ; i++) {
            StringBuilder s = new StringBuilder(str);
            StringBuilder sb = new StringBuilder("");
            int temp = i;
            for(int j=str.length() ; j>0 ; j--) {
                int remainder = temp%j;
                temp/=j;
                sb.append(s.charAt(remainder));
                s.deleteCharAt(remainder);
            }
            System.out.println(sb.toString());
        }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		solution(str);
        sc.close();
	}
}
