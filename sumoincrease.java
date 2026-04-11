import java.util.*;
public class sumoincrease {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int size=sc.nextInt();
        int sum=0;
        int maxincrease=0;
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<size;i++){
            if(arr[i]>arr[i-1]){
                sum=arr[i]+arr[i-1];
                maxincrease=(maxincrease<sum)?sum:maxincrease;
            }
        }
        if(maxincrease>0){
            System.out.println("Sum of Increasing order in the Array: "+maxincrease);
        }else{
            System.out.println("Given Array is no Sum of Increasing.");
        }
    }    
}
