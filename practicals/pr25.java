import java.util.Scanner;

class complex {
    double real;
    double imaginary;

    complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public complex add(complex n) {
        return (new complex((this.real + n.real), (this.imaginary + n.imaginary)));
    }

    public boolean compare(complex n) {
        if (this.real == n.real && this.imaginary == n.imaginary) {
            return true;
        }
        return false;

    }
}

public class pr25 {
    public static void main(String[] args) {
        System.out.println("Name: Harsh Shaileshbhai Joshi , Enrollment No: 210210116060");

        Scanner sc = new Scanner(System.in);
        double real = sc.nextDouble();
        double imaginary = sc.nextDouble();

        complex a = new complex(real, imaginary);
        complex answer = a.add(new complex(0, 0));

        System.out.println(answer.real + " " + answer.imaginary);

        System.out.println(a.compare(answer));

    }
}
