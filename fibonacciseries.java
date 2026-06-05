import java.util.*;
public class fibonacciseries {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int result=fibonacci(num);
        System.out.println(result);
        series(num);
    }
    static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+ fibonacci(n-2);
    }
    static void series(int num){
        int a=0;
        int b=1;
        for(int i=0;i<=num;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
