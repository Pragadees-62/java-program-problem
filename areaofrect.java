import java.util.Scanner;

public class areaofrect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double res = 3.14 * (radius * radius);
        double re = 2 * 3.14 * radius;
        System.out.println("Area of Circle: "+res);
        System.out.println("Perimeter of Circle: "+re);
    }
}
