import java.util.*;
public class climbingstairs {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
    }
}
class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int first=3;
        int second=2;
        for(int i=3;i<=n;i++){
            int third=second+first;
            second=first;
            first=third;
        }
        return second;
    }
}