package recursion_in_arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getStairPaths(n));
        sc.close();
    }
    public static ArrayList<String> getStairPaths(int n) {
        if(n==0) {
            return new ArrayList<>();
        }
        if(n==1) {
            ArrayList<String> ret = new ArrayList<>();
            /*
             * A much Simpler/readable approach would be to simply make the 3 calls and then code the base 
             * case in such a way that it simply returns nothing when a n<0.
             * if(n==0) {
             *      ArrayList<String> ret = new ArrayList<>();
             *      ret.add("");
             *      return ret;
             * }
             * else {
             *      return new ArrayList<>();
             * }
             * ArrayList<String> al1 = getStairPaths(n-1);
             * ArrayList<String> al2 = getStairPaths(n-2);
             * ArrayList<String> al3 = getStairPaths(n-3);
             * ArrayList<String> res = new ArrayList<>();
             * 
             * for(String s:al1) {
             *      res.add(1+s);
             * }
             * for(String s:al2) {
             *      res.add(2+s);
             * }
             * for(String s:al3) {
             *      res.add(3+s);
             * }
             * return res;
             */
            ret.add("1");
            return ret;
        }
        ArrayList<String> res = new ArrayList<>();
        for(int i=1 ; i<=Math.min(3, n) ; i++) {
            if(n-i>=0) {
                ArrayList<String> temp = getStairPaths(n-i);
                if(temp.size()==0) {
                    res.add(n+"");
                }
                else {
                    for(String s:temp) {
                        res.add(i+s);
                    }
                }
            }
        
        }
        return res;
    }
}
