class Circle {
    private double radius;
    private double centerX;
    private double centerY;

    public Circle(double radius) {
        this.radius = radius;
        this.centerX = 0.0;
        this.centerY = 0.0;
    }

    public Circle(double centerX, double centerY, double radius) {
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;

    }

    public double getCenterX() {
        return centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public double getRadius() {
        return radius;
    }
}

public class pr27 {
    public static void main(String[] args) {
        System.out.println("Name: Harsh Shaileshbhai Joshi , Enrollment No: 210210116060");

        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(2.0, 3.0, 7.0);

        System.out.println("Circle 1 properties: ");
        System.out.println("Rdious: " + circle1.getRadius());
        System.out.println("Center X: " + circle1.getCenterX());
        System.out.println("Center Y: " + circle1.getCenterY());

        System.out.println("Circle 2 properties: ");
        System.out.println("Rdious: " + circle2.getRadius());
        System.out.println("Center X: " + circle2.getCenterX());
        System.out.println("Center Y: " + circle2.getCenterY());

    }

}
