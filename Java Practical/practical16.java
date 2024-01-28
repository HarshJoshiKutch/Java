public class practical16 {
    public static void main(String args[]) {
        System.out.println("Name: Harsh Shaileshbhai Joshi , Enrollment No: 210210116060");
        String s1 = "java123is234fun";
        String replacestring = s1.replaceAll("\\d", " ");

        String Stringarray[] = replacestring.split(" ");

        for (String str : Stringarray) {
            System.out.println(str);
        }

    }
}