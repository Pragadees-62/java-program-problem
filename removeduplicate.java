import java.util.*;
public class removeduplicate{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        while(arr[i]!=null){
            if(arr[i]==0){
                arr[i]=arr[size-1];
            }
        }
        System.out.print(arr[i]);
    }
}
