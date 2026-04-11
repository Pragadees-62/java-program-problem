import java.util.*;
public class checkingalphabets {
    static String Ascii(String s){
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)>s.charAt(i+1)){
                return "No";
            }
        }
        return "Yes";
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.next();
        String result=Ascii(s);
        System.out.println(result);
    }
}
