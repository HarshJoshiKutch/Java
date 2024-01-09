public class pr12 {
    public static void main(String args[]) {
        System.out.println("Name: Harsh Shaileshbhai Joshi , Enrollment No: 210210116060");
        byte arr[] = { 10, 20, 30, 40 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double avg = sum / arr.length;

        System.out.println(avg);

    }
}
