import java.util.*;

// [2,4,6,8,10] ma jya 2 e starting che and 10 e ending che 

public class subarray {
    public static void printSubarrays(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) { // print

                    System.out.print(numbers[k] + " + "); // subaray
                    sum += numbers[k];
                }
                System.out.println("= " + sum);
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubarrays(numbers);
    }

}
