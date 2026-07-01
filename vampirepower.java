import java.util.*;
public class vampirepower{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int result=power(n,nums);
        System.out.print(result);
    }
    static int power(int n,int[] nums){
        if(n<=1){
            return n;
        }
        int m=nums[0];
        int l=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            int curr=Math.max(l,m+nums[i]);
            m=l;
            l=curr;
        }
        return l;
    }
}