import java.util.*;
public class maximumaveragesubarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int [] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.print(maximumaverage(arr,k));
    }
    static double maximumaverage(int[] arr,int k){
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int maxSum=sum;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i]-arr[i-k];
            maxSum=Math.max(maxSum,sum);
        }
        return (double)maxSum/k;
    }
}
