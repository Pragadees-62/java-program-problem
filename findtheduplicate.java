import java.util.*;
public class findtheduplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] moon=new int[num];
        for(int i=0;i<num;i++){
            moon[i]=sc.nextInt();
        }
        System.out.print(dupli(moon));
    }   
    static int dupli(int[] moon){
        for(int i=0;i<moon.length;i++){
            for(int j=i+1;j<moon.length;j++){
                if(moon[i]==moon[j]){
                    return moon[i];
                }
            }
        }
        return 0;
    } 
}
