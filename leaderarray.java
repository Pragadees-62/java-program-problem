import java.util.*;
public class leaderarray {
    void leader(int[] arr,int num){
        for(int i=0;i<num;i++){
            boolean found=true;
            for(int j=i+1;j<num;j++){
                if(arr[i]<arr[j]){
                    found =false;
                }
            }
            if(found){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
    void rightmovement(int[] arr,int num){
        int right=num-1;
        StringBuilder st=new StringBuilder();
        for(int i=num-1;i>=0;i--){
            if(arr[i]>=right){
                st.append(arr[i]+" ");
                right=arr[i];
            }
        }
        System.out.print(st.reverse());
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        leaderarray ob=new leaderarray();
        ob.leader(arr, num);
        ob.rightmovement(arr, num);
    }
}
