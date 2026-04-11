import java.util.*;
public class lengthoflongconsec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int longest = 0;

        for (int i = 0; i < n; i++) {
            int current = arr[i];
            int length = 1; 
            int next = current + 1;
            boolean found = true;
            
            while (found) {
                found = false;
                for (int j = 0; j < n; j++) {
                    if (arr[j] == next) {
                        length++;
                        next++;
                        found = true;
                        break;
                    }
                }
            }

            if (length > longest) {
                longest = length;
            }
        }

        System.out.println(longest);
    }
}