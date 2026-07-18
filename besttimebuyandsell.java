import java.util.*;
public class besttimebuyandsell {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] prices=new int[num];
        for(int i=0;i<num;i++){
            prices[i]=sc.nextInt();
        }
        int result=maxProfit(prices);
        System.out.print(result);
    }
    static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}
