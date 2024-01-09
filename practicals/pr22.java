import java.util.Scanner;

public class pr22 {
    public static void main(String[] args) {
        System.out.println("Name: Harsh Shaileshbhai Joshi , Enrollment No: 210210116060");
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String reverse = "";

        for (int i = s1.length() - 1; i >= 0; i--) {
            reverse += s1.charAt(i);
        }
        System.out.println(reverse);
    }
}
