import java.util.*;
public class chickenhead {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leg = sc.nextInt();
        int head = sc.nextInt();

        int rabbit = (leg - 2 * head) / 2;
        int chicken = head - rabbit;

        if (leg % 2 != 0 || head < 1  )  {
            System.out.println("Invalid input");
        } else {
            System.out.println("Chicken head: "+chicken);
            System.out.println("Rabbit head: "+rabbit);
        }
    }
}