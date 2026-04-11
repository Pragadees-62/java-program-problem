import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cars = 50;
        int count = 0;

        while (true) {

            if (!sc.hasNextInt()) {
                break;
            }

            int x = sc.nextInt();

            if (x < 0) {
                continue;
            }
            cars = cars - 1;
            count = count + 1;

            if (cars == 0) {
                break;
            }
        }

        System.out.println("Valid Exits = " + count);
    }
}
