import java.util.*;
public class lowestage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ages=new int[n];
        for(int i=0;i<ages.length;i++){
            ages[i]=sc.nextInt();

        }
        int lowest=ages[0];
        for(int age:ages){
            if(lowest>age){
                lowest=age;
            }
        }
        System.out.println(lowest);
    }
}
