import javax.swing.plaf.synth.SynthSpinnerUI;

public class method2 {

    // static void change(int a) {
    // a = 98;
    // }

    static void change2(int[] arr) {
        arr[0] = 98;
    }

    static void fine(int a) {
        System.out.println("Good morning" + a + "bro!");
    }

    static void fine(int a, int b) {
        System.out.println("Good morning" + a + "bro!");
        System.out.println("Good morning" + b + "bro!");

    }

    // static void telljoke() {
    // System.out.println("I invented a new word" + "Playiagirism!");
    // }

    public static void main(String args[]) {
        // telljoke();
        // int[] marks = { 52, 77, 89, 98, 94, 73 };
        // int x = 45;
        // change(x);
        // System.out.println(x);
        // int[] marks = { 52, 77, 89, 98, 94, 73 };
        // change2(marks);
        // System.out.println("the change a number is : " + marks[0]);
        fine(300);
        fine(3000, 4000);

    }
}
