public class IFsample {
    public static void main(String args[]) {
        int x, y;

        x = 10;
        y = 20;

        if (x < y) {
            System.out.println("x is less then y");
        }
        x = x * 2;
        if (x == y) {
            System.out.println("x is equal to y");
        }
        x = x * 2;

        if (x > y) {
            System.out.println("x is greater than y");
        }

        if (x == y)
            System.out.println("you won't see this");

    }
}
