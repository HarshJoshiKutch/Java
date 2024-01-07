import java.util.Scanner;

public class cgpa {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the physics marks:");
        float a = sc.nextFloat();

        System.out.println("enter the maths marks:");
        float b = sc.nextFloat();

        System.out.println("enter the basic electronics marks:");
        float c = sc.nextFloat();

        float sum = (a + b + c) / 30;

        System.out.println("cgpa using marks of 3 subject: " + sum);

    }

}
