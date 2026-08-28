import java.util.*;
public class LargestSumContigiousSubarray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] moon=new int[num];
        for(int p=0;p<num;p++){
            moon[p]=sc.nextInt();
        }
        System.out.print(longest(num,moon));
    }
    static int longest(int num,int[] moon){
        int preg=moon[0];
        int sum=moon[0];
        for(int p=1;p<num;p++){
            preg=Math.max(moon[p],preg+moon[p]);
            sum=Math.max(sum,preg);
        }
        return sum;
    }
}