class Circle {

    public double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getradius() {
        return radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

}

public class pr24 {

    public static void main(String[] args) {
        System.out.println("Name: Harsh Shaileshbhai Joshi , Enrollment No: 210210116060");
        Circle circle = new Circle(5.0);
        System.out.println("Area of the circle: " + circle.area());
    }
}
