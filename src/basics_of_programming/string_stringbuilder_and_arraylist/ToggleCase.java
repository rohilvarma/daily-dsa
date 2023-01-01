package basics_of_programming.string_stringbuilder_and_arraylist;
import java.util.Scanner;
public class ToggleCase {
    public static String toggleCase(String str){
        StringBuilder sb = new StringBuilder(str);
        for(int i=0 ; i<sb.length() ; i++) {
            char c;
            if((int)sb.charAt(i)>=97 && (int)sb.charAt(i)<=122) {
                c = (char)((int)sb.charAt(i) - 32);
            }
            else {
                c = (char)((int)sb.charAt(i)+32);
            }
            sb.insert(i+1, c);
            sb.deleteCharAt(i);
        }
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(toggleCase(str));
        sc.close();
	}
}
