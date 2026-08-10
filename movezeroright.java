import java.util.*;
class movezero{
    void right(int[] arr,int size){
        int j = 0; 
        for(int i = 0; i < size; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
public class movezeroright {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        movezero obj=new movezero();
        obj.right(arr, size);
        
    }
}