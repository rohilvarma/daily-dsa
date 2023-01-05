package recursion_and_backtracking.recursion_on_the_way_up;

import java.util.Scanner;

public class PrintEncodings {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printEncodings(str, "");
        sc.close();
    }

    static String[] encoding = new String[] {"", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    public static void printEncodings(String str, String asf) {
        if(str.length()==0) {
            System.out.println(asf);
            return;
        }
        if(str.charAt(0)!='0') {
            printEncodings(str.substring(1), asf+encoding[Character.getNumericValue(str.charAt(0))]);
            if(str.length()>1 && Integer.parseInt(str.substring(0,2))<27) {
                printEncodings(str.substring(2), asf+encoding[Integer.parseInt(str.substring(0, 2))]);
            }
        }
    }
}
