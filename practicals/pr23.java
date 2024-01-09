public class pr23 {
    
    public static void main(String[] args) {

        System.out.println("Name: Harsh Shaileshbhai Joshi , Enrollment No: 210210116060");
        StringBuffer stringbuffer = new StringBuffer();

        stringbuffer.append("Hello");
        stringbuffer.append(" ");
        stringbuffer.append("World");

        System.out.println("Original StringBuffer : " + stringbuffer.toString());
        stringbuffer.reverse();
        System.out.println("Reversed StringBuffer: " + stringbuffer.toString());

    }
}