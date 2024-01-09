import java.util.Scanner;

public class pr10 {
    public static void main(String args[]) {
        System.out.println("Name: Harsh Shaileshbhai Joshi , Enrollment No: 210210116060");
        int a1 = 0;
        int a2 = 1;
        int a3;
        System.out.println(a1 + " " + a2);

        for (int i = 2; i < 15; i++) {
            a3 = a1 + a2;
            System.out.println("" + a3);
            a1 = a2;
            a2 = a3;
        }
    }
}
