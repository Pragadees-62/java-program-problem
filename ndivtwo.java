import java.util.*;
public class ndivtwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int result=0;
        for(int i=0;i<num;i++){
            result=(result*10)+arr[i];
        }
        result=result/2;
        String s=Integer.toString(result);
        for(int i=0;i<num;i++){
            for(int j=i+1;j<num;j++){
                if(arr[i]==arr[j]){
                    
                }
            }
        }
    }
}
