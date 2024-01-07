class Employee {
    int id;
    String name;

    public void printdetails() {
        System.out.println("My id is " + id);
        System.err.println("And my name is " + name);

    }

}

public class objectclass {
    public static void main(String args[]) {
        System.out.println("This is our custom class");
        Employee harsh = new Employee();
        Employee jack = new Employee();

        harsh.id = 60;
        harsh.name = "Keval Padhariya";

        jack.id = 54;
        jack.name = "Jack Joshi";

        // System.out.println(harsh.id);
        // System.out.println(harsh.name);
        harsh.printdetails();
        jack.printdetails();

    }
}
