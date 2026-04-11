import java.util.*;
public class swaparray {
    public static void main(String[] args){
        Scanner prag = new Scanner(System.in);
        int n = prag.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[]{};
        for(int i = 0; i < n; i++){
            arr[i] = prag.nextInt();
        }
        for(int i = 0; i < n; i++){
            arr1[i] = arr[i];
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
