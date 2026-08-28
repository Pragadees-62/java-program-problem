import java.util.*;
public class rotatearraykelement {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] moon=new int[num];
        for(int i=0;i<num;i++){
            moon[i]=sc.nextInt();
        }
        int nannu=sc.nextInt();
        moonrotate(nannu,num,moon);
    }
    static int[] moonrotate(int nannu,int num,int[] moon){
        int[] forever=new int[num];
        for(int i=0;i<num;i++){
            forever[((i+nannu)%num)]=moon[i];
        }
        for(int i=0;i<num;i++){
            moon[i]=forever[i];
        }
        display(moon);
        return moon;
    }
    static void display(int[] moon){
        for(int i=0;i<moon.length;i++){
            System.out.print(moon[i]+" ");
        }
    }
}
