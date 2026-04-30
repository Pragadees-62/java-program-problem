import java.lang.reflect.Array;
import java.util.*;
public class add1inarray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        add1inarray obj=new add1inarray();
        obj.add1(arr,num);
    }
    void add1(int[] arr,int num){
        int result=0;
        for(int i=0;i<num;i++){
            result=(result*10)+arr[i];
        }
        result=result+1;
        for(int i=num-1;i>=0;i--){
            arr[i]=result%10;
            result/=10;
        }
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
