public class pr15 {
    public static void main(String args[]) {
        System.out.println("Name: Harsh Shaileshbhai Joshi , Enrollment No: 210210116060");
        String s1 = "HARSH";
        String s2 = "HARSH";

        boolean iseqal = s1.equals(s2);
        if (iseqal) {
            System.out.println(iseqal);
            System.out.println(s2.concat(s1));
        } else {
            iseqal = false;
            System.out.println(iseqal);
            System.out.println("is not equal");
        }
    }
}
