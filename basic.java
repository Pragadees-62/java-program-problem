import java.util.*;
public class basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int start=sc.nextInt();
        // int end=sc.nextInt();
        int size =sc.nextInt();
        int arr[] =new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(arr[size/2]);
        
    }
}
