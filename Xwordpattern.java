import java.util.*;
public class Xwordpattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String moon=sc.next();
        int n=moon.length();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    System.out.print(moon.charAt(i));
                }
                else if (j == n - i - 1) {
                    System.out.print(moon.charAt(j));
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}