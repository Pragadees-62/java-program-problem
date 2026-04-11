class Father{
    void display(){
        System.out.println("Hello Father");
    }
}
class Son extends Father{
    void display(){
        System.out.println("Hello Son");
    }
}

public class overriding {
    public static void main(String[] args) {
        Father ob = new Father();
        ob.display();
        Son obj=new Son();
        obj.display();
    }
}
