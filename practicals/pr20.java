public class pr20 {
    public static void main(String[] args) {
        System.out.println("Name: Harsh Shaileshbhai Joshi , Enrollment No: 210210116060");
        for (int i = 0; i < args.length; i++) {
            char temp = args[i].charAt(0);
            if (temp >= 'A' && temp <= 'Z') {
                System.out.println(args[i]);

            } else {
                System.out.println("First element is not in uppercase");
                break;
            }
        }
    }

}