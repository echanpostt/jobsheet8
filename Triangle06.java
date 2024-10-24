// import java.util.Scanner;

// /**
//  * Triangle06
//  */
// public class Triangle06 {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("masukkan nilai N: ");
//         int N = scanner.nextInt();
//         int i = 1;
//         while (i <= N) {
//             int j = 0;
//             while (j < i) {
//                 System.out.print("*");
//                 j++;
//             }

//             i++;
//         }
//     }
// }
import java.util.Scanner;

/**
 * Triangle06
 */
public class Triangle06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan nilai N: ");
        int N = scanner.nextInt();
        int i = 1;
        while (i <= N) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}