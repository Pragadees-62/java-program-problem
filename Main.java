import java.util.*;

class Circle {
    double radius;
    final double PI = 3.14159; 

    double area() { 
        return PI * radius * radius;
    }
    double perimeter(){
        return 2*PI*radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        Circle c = new Circle();
        c.radius = r;
        System.out.println("Area of Circle = " + c.area());
        System.out.println("Perimeter of Circle = "+c.perimeter());
        sc.close();
    }
}
