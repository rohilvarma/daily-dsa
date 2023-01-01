package recursion_and_backtracking.recursion_in_arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubSequence {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(gss(str));
        sc.close();
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==1) {
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            res.add(str);
            return res;
        }
        ArrayList<String> subString = gss(str.substring(1));
        int temp = subString.size();
        for(int i=0 ; i<temp ; i++) {
            subString.add(str.charAt(0) + subString.get(i));
        }
        return subString;
    }
}
