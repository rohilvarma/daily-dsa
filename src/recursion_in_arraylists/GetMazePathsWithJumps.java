package recursion_in_arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathsWithJumps {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(getMazePaths(1, 1, n, m));
        sc.close();
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        ArrayList<String> res = new ArrayList<>();
        if (sc == dc && sr == dr) {
            res.add("");
            return res;
        }

        for (int i = 1; i <= dc - sc; i++) {
            ArrayList<String> hPaths = getMazePaths(sr, sc + i, dr, dc);
            for (String s : hPaths) {
                res.add("h" + i + s);
            }
        }

        for (int i = 1; i <= dr - sr; i++) {
            ArrayList<String> vPaths = getMazePaths(sr + i, sc, dr, dc);
            for (String s : vPaths) {
                res.add("v" + i + s);
            }
        }

        for (int i = 1; i <= dr - sr && i <= dc - sc; i++) {
            ArrayList<String> dPaths = getMazePaths(sr + i, sc + i, dr, dc);
            for (String s : dPaths) {
                res.add("d" + i + s);
            }
        }
        return res;
    }
}
