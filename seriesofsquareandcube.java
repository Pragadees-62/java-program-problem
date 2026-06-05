import java.util.*;
public class seriesofsquareandcube {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int result=0;
        for(int i=1;i<=num;i++){
            result=(i*i)+(i*i*i);
            System.out.print(result+" ");
        }
    }
}
