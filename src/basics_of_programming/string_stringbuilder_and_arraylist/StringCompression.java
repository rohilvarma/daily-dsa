package basics_of_programming.string_stringbuilder_and_arraylist;

import java.util.Scanner;

public class StringCompression {
    public static String compression1(String str){
        char c = '.';
        StringBuilder sb = new StringBuilder("");
        for(char ch : str.toCharArray()) {
            if(c!=ch) {
                sb.append(ch);
                c = ch;
            }
        }
		return sb.toString();
	}

	public static String compression2(String str){
        char c = str.charAt(0);
        int count = 0;
        StringBuilder sb = new StringBuilder(str.charAt(0));
        for(char ch : str.toCharArray()) {
            if(c==ch) {
                count++;
            }
            else {
                sb.append(c);
                if(count>1) {
                    sb.append(count);
                }
                c = ch;
                count = 1;
            }
        }
        sb.append(c);
        if(count>1) {
            sb.append(count);
        }
		return sb.toString();
	}
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
        sc.close();
	}
}
