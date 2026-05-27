import java.util.*;
public class addbinary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        String result=addbin(a,b);
        System.out.print(result);
    }
    static String addbin(String a,String b){
        StringBuilder sb=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0 || j>=0 || carry>0){
            int c=i>=0? a.charAt(i)-'0':0;
            int d=j>=0? b.charAt(i) -'0':0;
            int sum=c+d+carry;
            i--;
            j--;
            int digit=sum%2;
            carry=sum/2;

            sb.append((char)(digit+'0'));
        }
        return sb.reverse().toString();
    }

}