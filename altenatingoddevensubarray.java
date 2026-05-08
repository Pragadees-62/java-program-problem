import java.util.*;
public class altenatingoddevensubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int [] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int count=1;
        int maxCount=0;
        for(int i=0;i<num-1;i++){
            if((arr[i]%2==0 && arr[i+1]%2!=0) || (arr[i]%2!=0 && arr[i+1]%2==0)){
                count++;
            }
            else{
                maxCount=Math.max(maxCount,count);
                count=1;
            }
        }
        maxCount=Math.max(maxCount,count);
        System.out.println(maxCount>=2?maxCount:0);
    }
}
