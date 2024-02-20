import java.util.*;

public class pairs {

    public static void printpairs(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i]; // 2,4,6,8,10

            for (int j = i + 1; j < numbers.length; j++) { // i+1 etle 2 lidho to ena pachino number print karava mate
                                                           // use thay pair ma
                System.out.print("(" + current + "," + numbers[j] + ")"); // jya aapne ema he
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printpairs(numbers);
    }
}