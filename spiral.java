import java.util.*;
public class spiral {
    public static void spiralmatrix(int[][] arr,int row,int col) {
        int top=0,left=0,right=col-1,bottom =row-1;
        while(top<=bottom && left <= right){
            for(int i=left;i<=right;i++){
                System.out.print(arr[top][i]+" ");
            }
            top++;
            for(int i=top;i<=bottom;i++){
                System.out.print(arr[i][right]+" ");
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=0;i--){
                    System.out.print(arr[bottom][i]+" ");
                }
                bottom--;

            }
            if(left<=right){
                for(int i =bottom;i>=0;i--){
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row= sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int [row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();

            }
        }
        spiralmatrix(arr, row, col);
    }    
}
