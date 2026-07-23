public class increment{
    public static void main(String[] args){
        int x=20;
        int y=35;
        x= x++ + y++;
        y= ++y + ++x;
        System.out.print(x+" "+y);
    }
}