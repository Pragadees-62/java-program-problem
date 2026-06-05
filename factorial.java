import java.util.*;
public class factorial{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int result=fact(num);
        System.out.println(result);
        series(num);
    }
    static int fact(int num){
        if(num<=1){
            return 1;
        }
        return num* fact(num-1);
    }
    static void series(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
            System.out.print(fact+" ");
        }
    }
}