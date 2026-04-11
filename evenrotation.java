import java.util.*;
public class evenrotation {
    void rotate(int[] arr,int num,int rotate){
        int j=0;
        for(int i=0;i<num;i++){
            if(j==num) return;
            if(arr[j]%2==0){
                for(int r=0;r<rotate;r++){
                    for(int k=j;k<num-1;k++){
                        if(arr[k]%2==0){
                            int temp=arr[j];
                            arr[j]=arr[k];
                            arr[k]=temp;
                            j=k;
                        }
                    }
                    j=0;
                    // System.out.println(Arrays.toString(arr));
                }
            }else{
                j++;
            } 
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int rotate=sc.nextInt();
        evenrotation obj=new evenrotation();
        obj.rotate(arr, num,rotate);
    }
}
