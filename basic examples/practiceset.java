import java.util.Scanner;

public class practiceset {
    public static void main(String args[]) {

        // problem1
        // int age = 10;
        // if (age > 11) {
        // System.out.println("I am 11");
        // } else {
        // System.out.println("I am not 11");
        // }

        // problem3

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income:");
        float tax = sc.nextFloat();

        float income = 3.3f;

        if (tax < 2.5) {
            tax = tax + 0;
        } else if (tax > 2.5f && tax < 5f) {
            tax = tax + 0.05f * (income - 2.5f);
        } else if (tax > 5f && tax < 10f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.05f * (income - 2.5f);
        } else if (tax > 10f) {
            tax = tax + 0.05f * (5f - 2.5f);
            tax = tax + 0.05f * (10f - 5f);
            tax = tax + 0.05f * (income - 10f);
        }
        System.out.println("the total tax is paid by employee is " + tax);

    }
}
