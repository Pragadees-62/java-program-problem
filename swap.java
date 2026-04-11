// With using Temp
// import java.util.Scanner;
// public class swap {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
//         int temp=a;
//         a=b;
//         b=c;
//         c=a;
//         System.out.println("Swap="+"value of a "+a+" value of b "+b+" value of c "+c);

//     }
// }
import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt(),b=sc.nextInt();
        a=a+b;b=a-b;a=a-b;
        System.out.println("After Swap a "+a+" b "+b);
    }
}