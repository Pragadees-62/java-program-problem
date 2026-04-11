// By Changing The Datatypes.
class hello{
    static int display(int a, int b){
        return a+b;
    }
    static float display(float a,float b,float c){
        return a+b+c;
    }
}
public class argument1 {
    public static void main(String[] args) {
        System.out.println(hello.display(2,3));
        System.out.println(hello.display(2.0f,7.7f,8.2f));
        }
}