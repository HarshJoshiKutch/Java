import java.util.Scanner;

public class pr21 {
    public static void main(String[] args) {
        System.out.println("Name: Harsh Shaileshbhai Joshi , Enrollment No: 210210116060");
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();

        String[] narr = s1.split(" ");
        double avg = 0;

        for (int i = 0; i < narr.length; i++) {
            double temp = Double.parseDouble(narr[i]);

            avg += temp / narr.length;
        }
        System.out.println(avg);
    }
}
