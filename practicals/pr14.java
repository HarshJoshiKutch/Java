import java.util.Scanner;

public class pr14 {
    public static void main(String args[]) {
        System.out.println("Name: Harsh Shaileshbhai Joshi , Enrollment No: 210210116060");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numberof rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the numberof coloums: ");
        int coloums = sc.nextInt();

        int arr[][] = new int[rows][coloums];

        System.out.println("Elements of the array: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloums; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int row[] : arr) {// ahiya rows ni jagyae row lidhu bane different hova joie ne etle
            for (int Elements : row) {
                sum = sum + Elements;
            }
        }
        System.out.println("Sum of all elements:" + sum);
    }
}
