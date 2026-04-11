class herit{
    void display(){
        System.out.println("Iphone -13");
    }
}
class ance extends herit{
    void display1(){
        System.out.println("Iphone -14");
    }
}
class inher {
    public static void main(String[] args) {
        ance obj =new ance();
        obj.display();
        obj.display1();
    }
}
