package recursion_and_backtracking.recursion_in_arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePaths {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(getMazePaths(1, 1, n, m));
        sc.close();
    }

    // sr - source row
    // sc - source column h  j  
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc) {
            ArrayList<String> ret = new ArrayList<>();
            ret.add("");
            return ret;
        }
        ArrayList<String> res = new ArrayList<>();
        ArrayList<String> hPaths = new ArrayList<>();
        ArrayList<String> vPaths = new ArrayList<>();
        if(sc<dc) {
            hPaths = getMazePaths(sr, sc+1, dr, dc);
        }
        if(sr<dr) {
            vPaths = getMazePaths(sr+1, sc, dr, dc);
        }
        for(String s:hPaths) {
            res.add("h"+s);
        }
        for(String s:vPaths) {
            res.add("v"+s);
        }
        return res;
    }
}
