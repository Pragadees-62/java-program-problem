import java.util.*;
class summa{
    public int countnumber(int num){
        int count=0;
        for(int i=2;i<num;i++){
            boolean pri=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    pri=false;
                    break;
                }
            }
            if(pri){
                count++;
            }
        }
        return count;
    }
    public void variable(int num){
        for(int i=2;i<num;i++){
            boolean p=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    p=false;
                    break;
                }
            }
            if(p){
                System.out.print(i+" ");

            }
        }
    }
}
public class primenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        summa obj=new summa();
        System.out.println(obj.countnumber(num));
        obj.variable(num);
    }
}
