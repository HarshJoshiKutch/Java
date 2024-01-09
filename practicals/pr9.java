import java.util.Random;
import java.util.random.*;

public class pr9 {
    public static void main(String[] args) {
        System.out.println("Name: Harsh Shaileshbhai Joshi , Enrollment No: 210210116060");
        Random rnd = new Random();
        double sum = 0;
        while (sum <= 20 && sum != 20) {
            Integer randomnum = rnd.nextInt(1, 10);
            sum += randomnum;
            System.out.println("Generated random number is : " + sum);
            System.out.println("sum after addition is: " + sum);
        }
        System.out.println("sum is now 20 and here your code is terminated.");
    }
}