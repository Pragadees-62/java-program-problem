import java.util.*;
public class happynumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextint();
        int result=happy(num);
        System.out.println(result);
    }
    static happy(int num){
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum+=rem*rem;
            num=num/10;
        }
        if(sum==1){
            return true;
        }
        else if(sum==4){
            return false;
        }
        else{
            return happy(sum);
        }
    }
}