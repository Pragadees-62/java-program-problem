import java.util.*;
public class throwconcept {
    static void fun(int a,int b) throws ArithmeticException{
        if(a>b){
            throw new ArithmeticException("A is a large Number.");
        }else{
            throw new ArithmeticException("B is a large Number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b =sc.nextInt();
        try{
            fun(a,b);
        }
        catch(Exception e){
            System.out.println("Result: "+e.getMessage());
        }
    }
}
