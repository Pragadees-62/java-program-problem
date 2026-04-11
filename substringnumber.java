import java.util.*;
public class substringnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String num = sc.next();
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            for (int j = i + 1; j <= num.length(); j++) {
                String sub = num.substring(i, j);
                sum += Integer.parseInt(sub);
            }
        }
        System.out.println(sum);
    }
}
