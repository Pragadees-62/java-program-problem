import java.util.*;
class calculate{
    void difference(int[] arr,int num){
        int oddcount =0;
        int evencount=0;
        for(int i=0;i<num;i++){
            if(arr[i]%2==0){
                evencount++;
            }else{
                oddcount++;
            }
        }
        System.out.print(oddcount-evencount);
    }
}
public class oddeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        calculate obj=new calculate();
        obj.difference(arr,num);
    }
}