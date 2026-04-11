import java.util.*;
class booking{
    void ticket(int num,int[] ar,int ticket){
        for(int i=0;i<=num;i++){
            if(0==ticket){
                System.out.println("Venna Driver Seat iruku vanthu okaruu.");
                return;
            }
            if(ar[i]==ticket){
                System.out.print("Seat "+ticket+" already booked");
                System.out.println();
            }
            if(i==ticket && ar[i]==0){
                ar[i]=ticket;
                System.out.print("Seat "+ticket+" booked");
                System.out.println();
            }
            if(num<ticket){
                System.out.println("Seat Ella Da thambi");
                return;
            }
        }
    }
    void print(int[] arr,int num){
        for(int i=1;i<=num+1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
public class busbooking{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        while(true){
            System.out.println("1.Book a Ticket  2.display variable seat 3.Exit");
            int slot=sc.nextInt();
            booking obj=new booking();
            switch (slot) {
                case 1:
                    int tiket=sc.nextInt();
                    obj.ticket(n,arr,tiket);
                    break;
                case 2:
                    obj.print(arr,n);
                    break; 
                case 3:
                    System.out.println("Thank you for Exit.");
                    return;
                default:
                    System.out.println("Give the Below the condition suitable number");
                    break;
            }
        }
    }
}