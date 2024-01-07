import java.util.Scanner;

public class elseifladder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yout age:");
        int age = sc.nextInt();

        if (age > 46) {
            System.out.println("You are experienced");
        } else if (age > 36) {
            System.out.println("You are semi-experienced");
        } else if (age > 26) {
            System.out.println("You are semi-semi-experienced");
        } else {
            System.out.println("You are not a experienced");
        }

    }
}
