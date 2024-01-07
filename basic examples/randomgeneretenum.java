import java.util.Random;

class randomgeneretenum {
    public static void main(String[] args) {
        int c;
        Random t = new Random();

        for (int i = 0; i <= 10; i++) {
            System.out.println(t.nextInt(10));
        }
    }
}