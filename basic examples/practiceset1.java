import java.rmi.server.SkeletonMismatchException;

import javax.print.DocFlavor.STRING;

class Employee {
    int Salary;
    String Name;

    public int getSalary() {
        return Salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String n) {
        Name = n;
    }

    public void callfriend() {
        System.out.println("Calling mukul");
    }
}

class Cellphone {
    public void rining() {
        System.out.println("Ringing....");
    }

    public void Vibrating() {
        System.out.println("Vibrating...");
    }

    public void callfriend() {
        System.out.println("Calling mukul");
    }
}

public class practiceset1 {
    public static void main(String args[]) {
        Employee harsh = new Employee();

        harsh.setName("My name is harsh joshi");
        harsh.Salary = 300;
        System.out.println(harsh.Name);
        System.out.println(harsh.getSalary());

        Cellphone asus = new Cellphone();
        asus.callfriend();
        asus.rining();
        asus.Vibrating();

    }

}
