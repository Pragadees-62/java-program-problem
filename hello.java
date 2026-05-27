import java.util.*;
class World{
    int id;
    String name;
    static String name1 = "Roll No";
    World(int id,String name){
        this.id =id;
        this.name=name;
    }
    void display(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(name1);
    }
    static{
        System.out.println("Welcome To Our Java Placement Training.");
    }
    static void fun(){
        System.out.println("Batch-2");
    }
}
class hello {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        World obj= new World(sc.nextInt(),sc.next());
        obj.display();
        World.fun();
    }
}
