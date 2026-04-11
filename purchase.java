import java.util.Scanner;

public class purchase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int price;
        int total = 0;
        int count = 0;
        boolean bought = false;

        while (true) {
            int price = sc.nextInt();

            if (price == 0) break;

            bought = true;

            total = total + price;
            count = count + 1;
        }

        if (!bought) {
            System.out.println("No items purchased");
        } else {
            System.out.println("Total Bill = " + total);
            System.out.println("Items Count = " + count);
        }
    }
}