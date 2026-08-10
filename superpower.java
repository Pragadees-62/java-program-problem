import java.util.*;
class superpower {
    static final int MOD = 1337;

    public static int superPow(int a, int[] b) {
        int result = 1;
        a %= MOD;
        for (int digit : b) {
            result = (pow(result, 10) * pow(a, digit)) % MOD;
        }
        return result;
    }
    private static int pow(int a, int k) {
        int res = 1;
        a %= MOD;
        while (k > 0) {
            if ((k & 1) == 1)
                res = (res * a) % MOD;

            a = (a * a) % MOD;
            k >>= 1;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int [] arr=new int[3];
        for(int i=0;i<3;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(superPow(a,arr));
    }
}