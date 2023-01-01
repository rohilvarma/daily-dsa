package basics_of_programming.string_stringbuilder_and_arraylist;

import java.util.Scanner;

public class StringWithDifferenceOfEveryTwoConsecutiveCharacters {
    public static String solution(String str){
        StringBuilder sb = new StringBuilder("");
        int i;
        for(i=0 ; i<str.length()-1 ; i++) {
            int diff = ((int)str.charAt(i+1) - (int)str.charAt(i));
            sb.append(str.charAt(i));
            sb.append(diff);
        }
        sb.append(str.charAt(i));
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
        sc.close();
	}
}
