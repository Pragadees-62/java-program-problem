abstract class A{
    abstract void fun();
    void fun1(){
        System.out.println("Good Morning");
    }
}
class B extends A{
    void fun(){
        System.out.println("Hello Guys");
    }
}
public class absract {
    public static void main(String[] args) {
        A sc = new B();
        sc.fun();
        sc.fun1();
    }
}