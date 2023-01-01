package recursion_in_arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKPC {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] seq = new String[] {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
        System.out.println(getKPC(str, seq));
        sc.close();
    }

    public static ArrayList<String> getKPC(String str, String[] seq) {
        if(str.length()==1) {
            ArrayList<String> ret = new ArrayList<>();
            for(int i=0 ; i<seq[Integer.parseInt(str)].length() ; i++) {
                ret.add(seq[Integer.parseInt(str)].charAt(i)+"");
            }
            return ret;
        }
        ArrayList<String> subString = getKPC(str.substring(1), seq);
        ArrayList<String> res = new ArrayList<>();
        String ss = seq[Character.getNumericValue(str.charAt(0))];
        for(int i=0 ; i<ss.length() ; i++) {
            for(String sTemp:subString) {
                res.add(ss.charAt(i) + sTemp);
            }
        }
        return res;
    }
}
