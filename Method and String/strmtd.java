public class strmtd {
    public static void main(String args[]) {
        String name = "HARSH";
        int value = name.length();
        System.out.println("The length of the string is :" + value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nontrimmedsString = "      Harsh      ";
        System.out.println(nontrimmedsString);

        String timmedString = nontrimmedsString.trim();
        System.out.println(timmedString);

        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 4));

        System.out.println(name.replace('r', 's'));
        System.out.println(name.startsWith("HAR"));
    }
}
