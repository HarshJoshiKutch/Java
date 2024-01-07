import java.util.Scanner;

class FahrenheittoCelsius {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int Fahrenheit = sc.nextInt();

        System.out.println("Enter temrature n Fehrenheit:");

        Fahrenheit = (((Fahrenheit - 32) * 5) / 9);
        System.out.println("the temprature is :" + Fahrenheit);

    }
}