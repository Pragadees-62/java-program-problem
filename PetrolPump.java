import java.util.*;
class PetrolPump {
    static int canCompleteCircuit(int[][] pumps) {
        int total = 0;
        int tank = 0;
        int start = 0;
        for (int i = 0; i < pumps.length; i++) {
            int petrol = pumps[i][0];
            int distance = pumps[i][1];
            int balance = petrol - distance;
            total += balance;
            tank += balance;
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }
        return (total >= 0) ? start : -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberofpump=sc.nextInt();
        int distance=sc.nextInt();
        int[][] pumps = new int[numberofpump][distance];
        for(int i=0;i<numberofpump;i++){
            for(int j=0;j<distance;j++){
                pumps[i][j]=sc.nextInt();
            }
        }
        System.out.println(canCompleteCircuit(pumps));
    }
}