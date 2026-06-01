import java.util.*;
public class rotatetwodarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] [] matrix=new int[num][num];
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < num; i++) {
            int left = 0;
            int right = num - 1;

            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
