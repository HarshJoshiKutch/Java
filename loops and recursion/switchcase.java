import java.util.Scanner;

public class switchcase {
    public static void main(String args[]) {
        int age;

        System.out.println("Enter the age:");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch (age) {

            case 18:
                System.out.println("You are going to be an adult");
                break;
            case 23:
                System.out.println("You are going to job");
                break;
            case 60:
                System.out.println("You are going to retired");
                break;
            default:
                System.out.println("Enjoy your life");
        }

    }
}
