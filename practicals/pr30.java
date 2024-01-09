class Bond {
    public void display() {
        System.out.println("Bond");
    }
}

class ConvertibleBond extends Bond {
    public void display() {
        System.out.println("ConvertibleBond");
    }
}

public class pr30 {
    public static void main(String[] args) {
        System.out.println("Name: Harsh Shaileshbhai Joshi , Enrollment No: 210210116060");

        Bond[] b1 = new Bond[6];
        b1[0] = new Bond();
        b1[1] = new ConvertibleBond();
        b1[2] = new Bond();
        b1[3] = new ConvertibleBond();
        b1[4] = new Bond();
        b1[5] = new ConvertibleBond();

        for (int i = 0; i < 6; i++) {
            b1[i].display();
        }
    }
}
