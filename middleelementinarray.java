import java.util.*;
public class middleelementinarray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int [] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++){
            for(int j=i+1;j<num;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        if(num%2!=0){
            System.out.print(arr[num/2]);
        }else{
            int sum=arr[num/2]+arr[(num/2)-1];
            System.out.print(sum/2);
        }
        System.out.println();
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}
