import javax.swing.plaf.synth.SynthLookAndFeel;

class base {
    int x;

    public int getx() {
        return x;
    }

    public void setx() {
        this.x = x;
    }

    public void printme() {
        System.out.println("I am a constructor");
    }

    class derived extends base {
        int z;
    }
    int z;

    public int gety() {
        return z;
    }

    public void sety(int y) {
        this.z =z ;
    }
}

class inheritence {
    public static void main(String args[]) {
        base b = new base();
        b.setx(4);

        System.out.println(b.getx());

    }
}