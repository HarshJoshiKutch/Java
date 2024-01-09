public class pr19 {
    public static void main(String args[]) {
        System.out.println("Name: Harsh Shaileshbhai Joshi , Enrollment No: 210210116060");
        int count = 0;
        for (int i = 0; i < args.length; i++) {
            count += args[i].length();
        }
        System.out.println(count);
    }
}
