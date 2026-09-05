import java.util.*;
class maximumsumofcontigoussubarray {
    public static void main(String[] args){
        Scanner moon=new Scanner(System.in);
        int num=moon.nextInt();
        int[] nums=new int[num];
        for(int i=0;i<num;i++){
            nums[i]=moon.nextInt();
        }
        System.out.print(maxSubArray(nums,num));
    }
    public static int maxSubArray(int[] nums,int num){
        int curr = nums[0];
        int result = nums[0];
        for(int i=1;i<num;i++){
            curr = Math.max(nums[i], curr + nums[i]);
            result = Math.max(result, curr);
        }
        return result>0?result:0;
    }
}