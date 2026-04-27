import java.util.*;
public class palindromenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        palindromenumber obj=new palindromenumber();
        obj.loop(n);
    }
    void loop(int n){
        int reverse=0;
        int original=n;
        while(n>0){
            reverse=reverse*10+n%10;
            n=n/10;
        }
        if(original==reverse){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}