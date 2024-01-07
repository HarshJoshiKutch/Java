public class pattern4 {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number:");

        // int n = sc.nextInt();
        int n = 4, m = 5;
        for (int i = 1; i <= n - i; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
