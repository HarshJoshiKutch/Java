import java.util.*;

public class pr34 {
    public static void main(String[] args) {
        System.out.println("Name: Harsh Shaileshbhai Joshi , Enrollment No: 210210116060");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        try {
            int answer = Integer.parseInt(s);
            System.out.println(answer);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException!");
        }
    }
}
