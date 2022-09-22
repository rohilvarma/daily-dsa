package string_stringbuilder_and_arraylist;

import java.util.Scanner;

public class PalindromicSubstrings {
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i<=j) {
            if(s.charAt(i)!=s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void solution(String str) {
        for(int i=0 ; i<str.length() ; i++) {
            for(int j=i+1 ; j<=str.length() ; j++) {
                String substring = str.substring(i, j);
                if(isPalindrome(substring)) {
                    System.out.println(substring);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        solution(str);
        sc.close();
    }
}
