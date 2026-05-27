import java.util.*;
public class oddevenpos{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        evenoddsum(num,arr);
    }
    static void evenoddsum(int num,int[] arr){
        int even=0;
        int odd=0;
        for(int i=0;i<num;i++){
            if(i%2==0){
                even+=arr[i];
            }else{
                odd+=arr[i];
            }
        }
        int result=even>odd?even-odd:odd-even;
        System.out.print(result);
    }
}