import java.util.*;
public class studentpassmark {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int student=sc.nextInt();
        int passcount=sc.nextInt();
        int[] studentmark=new int[student];
        for(int i=0;i<student;i++){
            studentmark[i]=sc.nextInt();
        }
        int j=studentmark.length-1;
        int passmark=0;
        Arrays.sort(studentmark);
        for(int i=0;i<passcount;i++){
            passmark=studentmark[j];
            j--;
        }
        System.out.print(passmark-1);
    }
}
