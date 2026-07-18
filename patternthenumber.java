import java.util.*;
public class patternthenumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int len = n-1;
        for(int i=1;i<=n;i++){
            for(int space=0;space<len;space++){
                System.out.print(" ");
            }
            len--;
            int val = i;
            for(int j=0;j<i;j++){
                int ans = val+j;
                System.out.print(ans);
            }
            for(int k=i;k>1;k--){
                int ans = val+k;
                System.out.print(ans-2);
            }
            System.out.println();
        }
    }
}