import java.util.*;
public class reversestring {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String ans=sc.next();
        String rev="";
        for(int i=ans.length()-1;i>=0;i--){
            rev+=ans.charAt(i);
        }
        System.out.println(rev);
        String result=new StringBuilder(ans).reverse().toString();
        System.out.print(result);
    }
}
