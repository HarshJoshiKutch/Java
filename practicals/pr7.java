public class pr7 {
    public static void main(String[] args) {
        System.out.println("Name: Harsh Shaileshbhai Joshi , Enrollment No: 210210116060");
        double number = Double.parseDouble(args[0]);
        String str1 = args[1].toLowerCase();
        if (str1.equals("meter")) {
            System.out.println("Meter into feet is: " + number * 3.28084);
        } else if (str1.equals("feet")) {
            System.out.println("Feet into meter is: " + number * 0.3048);
        } else {
            System.out.println("Invalid string you entered!");
        }
    }
}
