import java.util.*;
public class allice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        int target=arr[0];
        for(int i=1;i<num;i++){
            if(target!=arr[i]){
                count++;
            }
        }
        System.out.print(count);
    }
}