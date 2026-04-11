import java.util.*;

public class numberpattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for (int i = 1; i <= num; i++) {
            int res;
            if (i % 2 == 1) {
                res = 1;
            } else {
                res = 2;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(res + " ");
                res += 2;
            }
            System.out.println();
        }
        // for (int i = 1; i <= num; i++) {
        //     int res;
        //     if (i % 2 == 1) {
        //         res = 1;
        //         for (int j = 1; j <= i; j++) {
        //             System.out.print(res + " ");
        //             res += 2;
        //         }
        //         System.out.println();
        //     } else {
        //         res = 2;
        //         for (int j = 1; j <= i; j++) {
        //             System.out.print(res + " ");
        //             res += 2;
        //         }
        //         System.out.println();
        //     }
        //     }
        }
    }