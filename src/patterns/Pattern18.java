package patterns;

    import java.util.Scanner;

    public class Pattern18 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int count = n;
            for(int i=0 ; i<n ; i++) {
                for(int j=0 ; j<Math.min(i, n-i-1) ; j++) {
                    System.out.print("\t");
                }
                for(int j=0 ; j<count ; j++) {
                    if(i==0 || i>=n/2) {
                        System.out.print("*\t");
                    }
                    else {
                        if(j==0 || j==count-1) {
                            System.out.print("*\t");
                        }
                        else {
                            System.out.print("\t");
                        }
                    }
                }
                count = i<n/2 ? count-2 : count+2;
                System.out.println("");
            }
            sc.close();
        }
    }
