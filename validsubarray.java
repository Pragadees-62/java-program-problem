import java.util.*;
public class validsubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        validsubarray obj=new validsubarray();
        // obj.countValidSubarrays(arr, k);
        obj.calculatesumofsubarrays(arr,k);
    }
    public void countValidSubarrays(int[] arr, int k) {
        int left = 0, sum = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            while (sum >= k) {
                count += (arr.length - i);
                sum -= arr[left];
                left++;
            }
        }
        System.out.println(count);
    }
    public void calculatesumofsubarrays(int[] arr, int k) {
         int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        System.out.print(sum + " ");
        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - k];
            System.out.print(sum + " ");
        }
    }
}
