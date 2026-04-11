import java.util.*;
public class counttrailzero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int pow=5;
        int d;
        do{
            d=num/pow;
            pow*=5;
            sum+=d;
        }while(d!=0);
        System.out.print(sum);
    }
}
