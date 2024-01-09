import java.util.*;

public class pr32 {
    public static void main(String[] args) {
        System.out.println("Name: Harsh Shaileshbhai Joshi , Enrollment No: 210210116060");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            if (b == 0) {
            }
            int answer = (a / b);
            System.out.println(answer);
        } catch (Exception e) {
            System.out.println("number cannot divided by zero!");
        }
    }
}
