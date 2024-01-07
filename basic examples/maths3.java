import java.util.Scanner;

public class maths3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        if (a < b) {
            System.out.println("the number a is not greater than number b");
        } else if (a == b) {
            System.out.println("the number a and number b is equal");

        } else {
            System.out.println("the number a is greater than number b");
        }

    }
}
