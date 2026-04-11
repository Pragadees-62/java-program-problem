class Student {
    int id;
    String name;
    String nick;
    Student() {
        id = 456;
        name= "Aakash";
        nick = "komban";

    }
    Student(int i, String n,String g) {
        id = i;
        nick = g;
        name = n;
    }
    Student(Student a) {
        id = a.id;
        name = a.name;
        nick =a.nick;
    }
    static{
        System.out.println("Welcome To Java Placement Training.");
        System.out.println("Batch -2");   
    }
    void display() {
        System.out.println(name+" "+nick+" "+id);
    }
    static void fun() {
        System.out.println("Thank You");
    }
}

public class constructor {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2 = new Student(101,"Pragadees","Rossie");
        Student s3 = new Student(s1); 
        s1.display();
        s2.display();
        s3.display();
        Student.fun();
    }
}