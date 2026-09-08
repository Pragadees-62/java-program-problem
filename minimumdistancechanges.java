import java.util.*;
public class minimumdistancechanges {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String word1=sc.next();
        String word2=sc.next();
        System.out.print(minidistance(word1,word2));
    }
    static int minidistance(String s1, String s2){
        int m=s1.length();
        int n=s2.length();
        int [] [] res=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            res[i][0]=i;
        }
        for(int j=0;j<=n;j++){
            res[0][j]=j;
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    res[i][j]=res[i-1][j-1];
                }
                else{
                    int insert=res[i][j-1];
                    int delete=res[i-1][j];
                    int replace=res[i-1][j-1];
                    res[i][j]=1+ Math.min(insert,Math.min(delete,replace));
                }
            }
        }
        return res[m][n];
    }
}
