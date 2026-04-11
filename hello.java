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
        World obj= new World(37,"Pragadees");
        obj.display();
        World.fun();
    }
}
