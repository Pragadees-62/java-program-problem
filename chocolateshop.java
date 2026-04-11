import java.util.*;
class shop{
    public int chocolate(int[] arr,int num,int cost){
        int small=0;
        boolean found=false;
        for(int i=0;i<num;i++){
            for(int j=i+1;j<num;j++){
                int sum=arr[i]+arr[j];
                if(!found || sum<small){
                    small=sum;
                    found=true;
                }
            }
        }
        if(!found){
            return cost;
        }
        return cost-small;
        
    }
}
public class chocolateshop{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int cost=sc.nextInt();
        shop obj=new shop();
        System.out.println(obj.chocolate(arr,num,cost));
    }
}