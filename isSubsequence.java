import java.util.*;
public class isSubsequence {
    public boolean isSubseq(String s, String t) {
        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        isSubsequence obj=new isSubsequence();
        boolean result=obj.isSubseq(s,t);
        System.out.print(result);
    }
}

