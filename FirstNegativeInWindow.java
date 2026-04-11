import java.util.*;

public class FirstNegativeInWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  
        int k = sc.nextInt();   

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findFirstNegative(arr, n, k);
    }

    static void findFirstNegative(int[] arr, int n, int k) {

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                q.add(i);
            }
        }

        for (int i = k; i < n; i++) {

            if (!q.isEmpty()) {
                System.out.print(arr[q.peek()] + " ");
            } else {
                System.out.print("0 ");
            }

            while (!q.isEmpty() && q.peek() <= i - k) {
                q.poll();
            }

            if (arr[i] < 0) {
                q.add(i);
            }
        }

        if (!q.isEmpty()) {
            System.out.print(arr[q.peek()]);
        } else {
            System.out.print("0");
        }
    }
}