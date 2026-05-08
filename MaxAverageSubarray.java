import java.util.*;

public class MaxAverageSubarray {
    static int findMaxAverageIndex(int[] arr, int k) {
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;
        int maxIndex = 0;

        for (int i = k; i < arr.length; i++) {

            windowSum = windowSum - arr[i - k] + arr[i];

            if (windowSum > maxSum) {
                maxSum = windowSum;
                maxIndex = i - k + 1;
            }
        }

        return maxIndex;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int [] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int k1 = sc.nextInt();
        int output=findMaxAverageIndex(arr, k1);
        System.out.println(output);
    }
}
