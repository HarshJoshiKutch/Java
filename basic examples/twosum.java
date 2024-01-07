import java.util.Scanner;

public class twosum {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();

        System.out.println("Enter the second number:");
        int b = sc.nextInt();

        System.out.println("Enter the third number:");
        int c = sc.nextInt();

        System.out.print("the result is :" + sumoftwo(a, b, c));
    }

    public static boolean sumoftwo(int p, int q, int r) {
        return ((p + q) == r || (q + r) == p || (r + p) == q);
    }

}
