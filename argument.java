// By Changing The Number Of Argument.
class hello{
    static int display(int a, int b){
        return a+b;
    }
    static int display(int a,int b,int c){
        return a+b+c;
    }
}
public class argument {
    public static void main(String[] args) {
        System.out.println(hello.display(2,3));
        System.out.println(hello.display(2,7,8));
        }
}
