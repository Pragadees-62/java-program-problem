import java.util.Scanner;
class sorting{
    void sort(int[] arr,int num){
        for(int i=0;i<num;i++){
            for(int j=0;j<num-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    void merge(int[] arr,int[] ar,int num,int size){
        for(int i=0;i<num;i++){
            if(arr[i]>ar[0]){
                int temp=arr[i];
                arr[i]=ar[0];
                ar[0]=temp;

                sort(ar, size);
            }
        }
    }
    void print(int[] arr){
        for(int result:arr){
            System.out.print(result+" ");
        }
        System.out.println();
    }
}
public class mergetwoarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr1=new int[num];
        for(int i=0;i<num;i++){
            arr1[i]=sc.nextInt();
        }
        int size=sc.nextInt();
        int[] arr2=new int[size];
        for(int i=0;i<size;i++){
            arr2[i]=sc.nextInt();
        }
        sorting ob=new sorting();
        ob.merge(arr1,arr2,num,size);
        ob.print(arr1);
        ob.print(arr2);
    }
}
