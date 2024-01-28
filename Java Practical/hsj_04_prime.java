import java.util.Scanner;

public class hsj_04_prime {
    public static void main(String args[]) {
        System.out.println("Name: Harsh Shaileshbhai Joshi , Enrollment No: 210210116060");
        System.out.println("Enter the number:");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {

                flag = 1;
                break;
            } else {
                flag = 0;
            }

        }
        if (flag == 1) {
            System.out.println("the number is not prime");
        } else {
            System.out.println("the number is prime");
        }

    }
}
