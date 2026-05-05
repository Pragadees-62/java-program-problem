import java.util.*;
public class alternativeposandneg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int pos[]=new int[num];
        int neg[]=new int[num]; 
        int p=0,n=0;
        for(int i=0;i<num;i++){
            if(arr[i]>=0){
                pos[p]=arr[i];
                p++;
            }
            else{
                neg[n]=arr[i];
                n++;
            }
        }
        int i=0,j=0;
        while(i<p && j<n){
            System.out.print(pos[i]+" ");
            System.out.print(neg[j]+" ");
            i++;
            j++;
        }
        while(i<p){
            System.out.print(pos[i]+" ");
            i++;
        }
        while(j<n){
            System.out.print(neg[j]+" ");
            j++;
        }   
    }
}
