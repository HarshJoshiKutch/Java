import java.util.Scanner;

public class pr17 {
    public static void main(String args[]) {
        System.out.println("Name: Harsh Shaileshbhai Joshi , Enrollment No: 210210116060");
        int lenth = args[0].length();
        System.out.println(lenth);
        if (lenth < 10) {
            System.out.println("Substring is not possible");
            return;
        }

        String s = args[0].substring(lenth - 10);
        System.out.println(s);
    }
}
