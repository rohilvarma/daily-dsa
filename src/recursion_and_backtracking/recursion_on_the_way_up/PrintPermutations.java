package recursion_and_backtracking.recursion_on_the_way_up;

import java.util.Scanner;

public class PrintPermutations {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printPermutations(str, "");
        sc.close();
    }

    public static void printPermutations(String str, String asf) {
        if(str.length()==0) {
            System.out.println(asf);
            return;
        }
        for(int i=0 ; i<str.length() ; i++) {
            char c = str.charAt(i);
            printPermutations(str.substring(0,i) + str.substring(i+1,str.length()), asf+c);
        }
        // for(char c:str.toCharArray()) {
        //     printPermutations(str.substring(c, c), asf+c);
        // }
    }
}
