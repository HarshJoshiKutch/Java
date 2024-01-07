import java.io.FilenameFilter;

public class fibonacchi {

    public static int fibrecursion(int count) {
        if (count == 0) {
            return 0;
        }
        if (count == 1 || count == 2) {
            return 1;
        }
        return fibrecursion(count - 1) + fibrecursion(count - 2);

    }

    public static void main(String args[]) {
        int fiblen = 15;

        System.out.println("FIBONACI SERIES");
        for (int i = 0; i < fiblen; i++) {
            System.out.println(fibrecursion(i));
        }

    }

}
