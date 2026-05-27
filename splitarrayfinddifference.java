import java.util.*;
public class splitarrayfinddifference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int []arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        splitarray(arr, num);
    }
    static void splitarray(int[] arr,int num){
        int n=arr.length/2;
        int first=0;
        int second=0;
        for(int i=0;i<n;i++){
            first+=arr[i];
        }
        for(int i=n;i<num;i++){
            second+=arr[i];
        }
        int result=first>second?first-second:second-first;
        System.out.println(result);
    }
}
