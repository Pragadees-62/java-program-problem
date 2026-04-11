import java.util.Scanner;;
public class leapyear {
    public static void main(String[] args){
        Scanner year = new Scanner(System.in);
        int y=year.nextInt();
        if(y%400==0 || y%4==0 && y%100 !=0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}