import javax.swing.plaf.synth.SynthSpinnerUI;

public class pr18 {
    public static void main(String args[]) {
        System.out.println("Name: Harsh Shaileshbhai Joshi , Enrollment No: 210210116060");
        String s1 = "10,20,30,40,50";

        String[] numbersarray = s1.split(",");
        int lenth = numbersarray.length;

        System.out.println(numbersarray[lenth - 1]);
    }
}
