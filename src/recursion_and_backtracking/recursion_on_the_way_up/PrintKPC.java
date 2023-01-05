package recursion_and_backtracking.recursion_on_the_way_up;

import java.util.Scanner;

public class PrintKPC {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printKPC(str, "");
        sc.close();
    }
    static String[] seq = new String[] {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printKPC(String str, String asf) {
        if(str.length()==0) {
            System.out.println(asf);
            return;
        }
        int num = Character.getNumericValue(str.charAt(0));
        String seqStr = seq[num];
        for(char c:seqStr.toCharArray()) {
            printKPC(str.substring(1), asf+c);
        }

    }
}
