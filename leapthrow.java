import java.util.*;
public class leapthrow {
    static void year(int yr) throws ArithmeticException{
        if((yr%100!=0&& yr%4==0)||yr%400==0){
            throw new ArithmeticException(yr+" is a leap Year.");
        }else{
            throw new ArithmeticException(yr+" is not a leap Year.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yr=sc.nextInt();
        try{
            year(yr);
        }
        catch(Exception e){
            System.out.println("Calculating the given Year: "+e.getMessage());
        }
    }
}