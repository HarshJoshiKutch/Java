public class pr16 {
    public static void main(String args[]) {
        String s1 = "java123is234fun";
        String replacestring = s1.replaceAll("\\d", " ");

        String Stringarray[] = replacestring.split(" ");

        for (String str : Stringarray) {
            System.out.println(str);
        }

    }
}