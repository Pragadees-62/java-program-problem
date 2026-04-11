import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int orig = num;
        int sum=0;
        int temp = num;
        int digits = String.valueOf(num).length();
        while(temp>0){
            int digit= num %10;
            sum+=Math.pow(digit, digits);
            temp=num/10;
        }
        if(sum == orig){
            System.out.println(num+" is an Armstrong Number");
        }else{
            System.out.println(num+" is not an Armstrong Number");
        }
    }
}
