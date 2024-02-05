import java.util.*;

public class pt1 {
    public static void main(String[] args) {
        int x = 1;
        for (int i = 0; i <= 4; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }
    }
}

// public class pt1 {
//     public static void main(String[] args) {
//         for (int i = 0; i <= 4; i++) {

//             for (int j = 0; j <= i; j++) {
//                 int t = i + 97;
//                 char a = (char) t;
//                 System.out.print(a);

//             }
//             System.out.println();
//         }
//     }
// }
