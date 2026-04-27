import java.util.*;
public class chickenhead {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int leg=sc.nextInt();
        int head=sc.nextInt();
        int chicken=0;
        int rabbit=0;
        int balance=0;
        if(leg%4==0){
            rabbit=leg/4;
            balance=leg%4;
            chicken=0;
        }
        else{
            chicken=(balance/2);
        }
        if(chicken+rabbit==head){
            System.out.println(chicken+" "+rabbit);
        }
        else{
            System.out.println((chicken+rabbit));
        }
    }
}
