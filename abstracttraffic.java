abstract class Traffic{
    abstract void Car();
    abstract void Bike();
    void Display1(){
        System.out.println("Stop Vehicles");
    }
}
class Cars extends Traffic{
    void Car(){
        System.out.println("Ready To Go Cars");
    }
    void Bike(){
        System.out.println("Stop The Bike");
    }
}
class Bikes extends Traffic{
    void Bike(){
        System.out.println("Ready To Go Bikes");
    }
    void Car(){
        System.out.println("Stop The Cars");
    }
}
public class abstracttraffic {
    public static void main(String[] args) {
        Traffic sc = new Cars();
        sc.Display1();
        sc.Car();
        sc.Bike();
        Traffic B = new Bikes();
        B.Display1();
        B.Bike();
        B.Car();
    }
}