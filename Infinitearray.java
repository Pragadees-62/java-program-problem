import java.util.*;
public class Infinitearray {
    static void infiniteArray(int[] arr,int[] start,int[] end){
        int[] temp = new int[start.length];
        for(int i=0;i<start.length;i++){
            int st = start[i];
            int fin = end[i];
            int sum =0;
            for(int j=st-1;j<=fin-1;j++){
                sum+=arr[(j%arr.length)];
            }
            temp[i] = sum;
        }
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]);
            if(i!=temp.length-1) System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int j=0;j<t;j++){
            int n = scan.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = scan.nextInt();
            }
            int q = scan.nextInt();
            int[] start = new int[q];
            int[] end = new int[q];
            for(int i=0;i<q;i++){
                start[i] = scan.nextInt();
            }
            for(int i=0;i<q;i++){
                end[i] = scan.nextInt();
            }
            infiniteArray(arr,start,end);
            if(j+1<=t) System.out.println();
        }
    }
}