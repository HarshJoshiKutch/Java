class Sphere {
    private double radius;
    private double centerX;
    private double centerY;
    private double centerZ;

    public Sphere(double radius, double centerX, double centerY, double centerZ) {
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
        this.centerZ = centerZ;
    }

    public double getRadius() {
        return radius;
    }

    public double getCenterX() {
        return centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public double getCenterZ() {
        return centerZ;
    }
}

public class pr26 {
    public static void main(String[] args) {
        System.out.println("Name: Harsh Shaileshbhai Joshi , Enrollment No: 210210116060");

        double radius = 5.0;
        double centerX = 2.0;
        double centerY = 3.0;
        double centerZ = 4.0;

        Sphere sphere = new Sphere(radius, centerX, centerY, centerZ);

        System.out.println("Sphere propertise: ");
        System.out.println("radius" + sphere.getRadius());
        System.out.println("radius" + sphere.getCenterX());
        System.out.println("radius" + sphere.getCenterY());
        System.out.println("radius" + sphere.getCenterZ());

    }
}
