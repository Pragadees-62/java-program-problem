import java.util.*;

public class chocoraffles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int ans = num;

        while (num >= 3) {
            ans += num/3;
            num = num/3 + (num % 3);
        }

        System.out.println(ans);
    }
}