import java.util.*;

class I2 {
    public String getDescription() {
        return ("I2 ");
    }
}

class J2 extends I2 {
    public String getDescription() {
        return ("J2 " + super.getDescription());
    }
}

class K2 extends J2 {
    public String getDescription() {
        return ("K2 " + super.getDescription());
    }
}

public class pr31 {
    public static void main(String[] args) {
        System.out.println("Name: Harsh Shaileshbhai Joshi , Enrollment No: 210210116060");
        K2 k2 = new K2();
        J2 j2 = new J2();
        I2 i2 = new I2();

        System.out.println(k2.getDescription());
        System.out.println(j2.getDescription());
        System.out.println(i2.getDescription());
    }
}
