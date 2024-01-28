import java.util.Scanner;

public class hsj_02 {
    public static void main(String args[]) {
        System.out.println("Name: Harsh Shaileshbhai Joshi , Enrollment No: 210210116060");
        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        // int n;
        while (true) {
            int a = sc.nextInt();

            if (a % 2 == 0) {
                System.out.println("the number is even");
            } else {
                System.out.println("The number is odd");
            }
        }
    }
}
