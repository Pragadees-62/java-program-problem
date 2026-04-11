import java.util.*;
class soldier{
    void deadth(int[] arr,int num){
        int[] res=new int[num+1];
        int left,right;
        for(int i=1;i<num-1;i+=2){
            left=i;
            right=i+1;
            System.out.println(left+" "+right);
            res[right]=1;
        }
        System.out.println(Arrays.toString(res));
    }
}
public class soldierwar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr={1,2,3,4,5,6,7};
        // for(int i=0;i<num;i++){
        //     arr[i]=sc.nextInt();
        // }
        soldier obj=new soldier();
        obj.deadth(arr, num);
    }
}
