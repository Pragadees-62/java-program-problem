import java.util.*;
public class rotatematrix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] [] arr=new int[num][num];
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<num;i++){
            for(int j=num-1;j>=0;j--){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}