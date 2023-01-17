package recursion_and_backtracking.recursion_backtracking;

import java.util.HashSet;
import java.util.Scanner;

public class FloodFill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        floodfill(arr, 0, 0, "");
        sc.close();
    }

    static HashSet<String> hs = new HashSet<>();
    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf) {
        if(hs.contains(sr + "" + sc)) {
            return;
        }
        else {
            hs.add(sr + "" + sc);
            if(sr<0 || sr==maze.length || sc<0 || sc==maze[0].length || maze[sr][sc]==1) {
                hs.remove(sr + "" + sc);
                return;
            }
            if(sr==maze.length-1 && sc==maze[0].length-1) {
                System.out.println(asf);
                hs.remove(sr + "" + sc);
                return;
            }
            
            floodfill(maze, sr-1, sc, asf + "t");
            floodfill(maze, sr, sc-1, asf + "l");
            floodfill(maze, sr+1, sc, asf + "d");
            floodfill(maze, sr, sc+1, asf + "r");
            hs.remove(sr + "" + sc);
        }
    }
}