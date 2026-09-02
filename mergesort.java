import java.util.*;
public class mergesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int[] arrr = new int[b];
        for(int i = 0; i < b; i++){
            arrr[i] = sc.nextInt();
        }
        int[] result = new int[a + b];
        int i = 0, j = 0, k = 0;
        while(i < a && j < b){
            if(arr[i] < arrr[j]){
                result[k++] = arr[i++];
            }else{
                result[k++] = arrr[j++];
            }
        }
        while(i < a){
            result[k++] = arr[i++];
        }
        while(j < b){
            result[k++] = arrr[j++];
        }
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}