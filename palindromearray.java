import java.util.*;
class palindrome{
    void palin(int[] arr,int num){
        boolean found=true;
        int start=0;
        int end=num-1;
        while(start<end){
            if(arr[start]!=arr[end]){
                found=false;
                break;
            }
            start++;
            end--;
        }
        if(found){
            System.out.print("Palindrome Array");
        }else{
            System.out.print("Not Palindrome Array");
        }
    }
}
public class palindromearray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        palindrome obj=new palindrome();
        obj.palin(arr, num);
    }
}