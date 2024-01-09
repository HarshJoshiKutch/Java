class Sphere1 {
    double centerX;
    double centerY;
    double centerZ;
    double radius;

    Sphere1() {
        this.radius = 1.0;
    }

    public Sphere1(double radius) {
        this.radius = radius;
    }

    public Sphere1(double radius, double centerX, double centerY, double centerZ) {
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
        this.centerZ = centerZ;
    }
}

public class pr28 {
    public static void main(String[] args) {
        System.out.println("Name: Harsh Shaileshbhai Joshi , Enrollment No: 210210116060");

        Sphere1 s1 = new Sphere1();
        Sphere1 s2 = new Sphere1(3.0);
        Sphere1 s3 = new Sphere1(1.5, 2.0, -1.0, 4.0);

        System.out.println("Sphere 1 propertise: " + s1.radius);
        System.out.println("sphere 2 properties: " + s2.radius);
        System.out
                .println("sphere 3 properties: " + s3.radius + "," + s3.centerX + "," + s3.centerY + "," + s3.centerZ);

    }
}
