import java.util.*;
public class missingpostive {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int ar[] =new int[num];
        for(int i=0;i<num;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++){
            for(int j=i+1;j<num;j++){
                if(ar[i]>ar[j]){
                    int temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        int missing=1;
        for(int i=1;i<num;i++){
            if(ar[i]==missing){
                missing++;
            }
        }
        System.out.println(missing);
    }
}
