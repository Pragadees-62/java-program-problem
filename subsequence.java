import java.util.*;
public class subsequence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        boolean flag=isSubsequence(s,t);
        System.out.print(flag);
    }
    static boolean isSubsequence(String s, String t) {
        int count=0;
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                count++;
                i++;
            }
            j++;
        }
        return count==s.length();
    }
}
