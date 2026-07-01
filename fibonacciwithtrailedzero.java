import java.util.*;
public class fibonacciwithtrailedzero {
       public static void main(String[] args) {
               Scanner scan = new Scanner(System.in);
               int n = scan.nextInt();
               int count = 0;
               while(n > 0){
                     count +=(n/=5);
               }
               System.out.print(count);
        }
}

