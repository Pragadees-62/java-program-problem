import java.util.*;
public class removeduplicate{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<size;i++){
            set.add(arr[i]);
        }  
        for(int num:set){
                System.out.print(num+" ");
        }

    }
}
