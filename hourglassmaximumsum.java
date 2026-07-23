import java.util.*;
public class hourglassmaximumsum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] [] arr=new int[num][num];
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print(maxHourglassSum(arr));
    }
    public static int maxHourglassSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length-2; i++) {
            for(int j = 0; j < arr[i].length-2; j++) {
                int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]+ arr[i + 1][j + 1]+ arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}
