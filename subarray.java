import java.util.*;
public class subarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        //PRINT THE SUB ARRAY
        // int count=0;
        // for(int i=0;i<size;i++){
        //     int j=i;
        //     int val=1;
        //     while (j<size) {
        //         val*=arr[j];
                
                // System.out.print("[");
                // for(int k=i;k<=j;k++){
                //     System.out.print(arr[k]+" ");
                // }
                // System.out.print("]");
                // j++;
        //     }
        //     System.out.print(val);
        // }
        // COUNT OF SUM SUBARRAY AND EVEN NUMBER
        //  int count=0;
        // for(int i=0;i<size;i++){
        //     int j=i;
        //     int sum=0;
        //     while(j<size){
        //         sum+=arr[j];
        //         if(sum%2==0){
        //             count+=1;
        //             System.out.print(sum+" ");
        //         }
        //         j++;

        //     }
        // }
        // System.out.println();
        // System.out.print(count);
        //FIND THE K VALUE
    //     int k=s.nextInt();
    //     for(int i=0;i<size;i++){
    //         if(arr[i]==k){
    //             System.out.print("Found at Index of "+k+" value is "+i);
    //         }
    //    }
        //LEFT ROTATION OF K TH TIME
        int k=s.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i]==k){
                System.out.print("Found at Index of "+k+" value is "+i);
            }
       }
    }
}
