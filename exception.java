import java.util.*;
public class exception {
    void fun(int a,int b){
        int c=a/b;
        System.out.println("Result: "+c);
    }
    void fun2(int c,int d){
        fun(c,d);
    }
    void fun3(int f,int g){
        try{
            fun2(f,g);
        }
        catch(ArithmeticException e){
            System.err.println("Error will occur");
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        exception obj =new exception();
        obj.fun3(a,b);
    }
}