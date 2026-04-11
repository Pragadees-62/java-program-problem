interface Hi{
    void Display();
}
class Bye implements Hi{
    public void Display(){
        System.out.println("Bye Pass");
    } 
}
public class Interface {
    public static void main(String[] args){
        Bye obj =new Bye();
        obj.Display();
    }
}