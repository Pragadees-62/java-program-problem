import java.util.*;
public class buyandselltheproduct {
    public static void main(String[] args){
        Scanner moon=new Scanner(System.in);
        int num=moon.nextInt();
        int[] nums=new int[num];
        for(int i=0;i<num;i++){
            nums[i]=moon.nextInt();
        }
        System.out.print(buyandsell(nums,num));
    }
    static int buyandsell(int[] nums,int num){
        int minindex=0;
        int minvalue=Integer.MAX_VALUE;
        for(int i=0;i<num;i++){
            if(minvalue>nums[i]){
                minvalue=nums[i];
                minindex=i;
            }
        }
        int maxvalue=Integer.MIN_VALUE;
        for(int i=minindex+1;i<num;i++){
            if(maxvalue<nums[i]){
                maxvalue=nums[i];
            }
        }
        return maxvalue-minvalue;
    }
}
