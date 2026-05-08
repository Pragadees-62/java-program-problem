import java.util.*;
public class perfectsqrootcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int count = 0;
        int min=Integer.MAX_VALUE;
        for (int i = 1; i<n; i++) {
            int sq=1;
            while(sq*sq<=arr[i]){
                if(sq* sq==arr[i]){
                    count++;
                    min=Math.min(min,arr[i]);
                }
                sq++;
            }
        }
        if(count==k){
           System.out.println(min);
        }
        else{
            System.out.println(0);
        }
    }
}