import java.util.*;
public class pattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            int res=(i*i)+(i*i*i);
            System.out.print(res+" ");
        }
        // for(int i=1;i<=num;i++){
        //     int res =i*i;
        //     System.out.print(res+" ");
        // }
        // for(int i=1;i<=num;i++){
        //     if(num%i==0){
        //         System.out.print(i+" ");
        //     }
        // }
    }
}