import java.util.*;

public class randomnumber {
    public static void main(String[] args) {
        Random sc=new Random();
        int num=0;
        int count=0;
        while(num!=999){
            num=sc.nextInt(1001);
            System.out.print(num+" ");
            count++;
        }System.out.println();
        System.out.print(count);

    }
}
