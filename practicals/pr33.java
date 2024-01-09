import java.util.*;

class InvalidAge extends Exception {
    public InvalidAge() {
    }
}

public class pr33 {
    public static void main(String[] args) {
        System.out.println("Name: Harsh Shaileshbhai Joshi , Enrollment No: 210210116060");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try {
            if (age < 0) {
                throw new InvalidAge();
            }
            System.out.println("Age is alright");
        } catch (InvalidAge e) {
            System.out.println("Invalid age!");

        }
    }
}
