import java.util.Scanner;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "rohil, varma, sanskriti, kalra";
        System.out.println(str.split(" ").length==4);
        System.out.println(str.substring(str.length()-2).equals("ma"));
        sc.close();
    }
}