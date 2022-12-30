package introduction_to_recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t1id = sc.nextInt();
        int t2id = sc.nextInt();
        int t3id = sc.nextInt();
        toh(n, t1id, t2id, t3id);
        sc.close();
    }

    public static void print(int n, int x, int y) {
        System.out.println(n + "[" + x + "->" + y + "]");
    }

    public static void toh(int n, int t1id, int t2id, int t3id){
        if(n==0) {
            return;
        }
        toh(n-1, t1id, t3id, t2id);
        print(n, t1id, t2id);
        toh(n-1, t3id, t2id, t1id);
    }
}

