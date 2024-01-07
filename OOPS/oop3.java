// class Pen {
//     String color;
//     String type;

//     public void write() {
//         System.out.println("writing something");
//     }

//     public void printcolor() {
//         System.out.println(this.color);
//     }

class Student {

    int age;
    String name;

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() {
        System.out.println("constructor called");
    }
}
// }

public class oop3 {
    public static void main(String args[]) {
        // Pen pen1 = new Pen();
        // pen1.color = "Red";
        // pen1.type = "Gel";

        // Pen pen2 = new Pen();
        // pen2.color = "Black";
        // pen2.type = "ballpoint";

        // pen1.printcolor();
        // pen2.printcolor();

        Student s1 = new Student();
        s1.age = 19;
        s1.name = "Harsh";
        s1.printinfo();

    }

}
