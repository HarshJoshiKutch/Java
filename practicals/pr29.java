class Circle1 {
    private double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle1 {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 2 * super.calculateArea() * height;
    }
}

public class pr29 {
    public static void main(String[] args) {
        System.out.println("Name: Harsh Shaileshbhai Joshi , Enrollment No: 210210116060");

        Circle1 circle = new Circle1(5.0);
        System.out.println("Circle area : " + circle.calculateArea());

        Cylinder cylinder = new Cylinder(3.0, 7.0);
        System.out.println("Cylinder area : " + cylinder.calculateArea());

    }
}
