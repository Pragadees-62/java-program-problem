import java.util.*;
class water{
    public int trapped(int[] height,int n){
        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;
        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }
        return water;
    }
}
public class trappedwater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] height = new int[n];
        
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        water obj =new water();
        System.out.println(obj.trapped(height, n));
    }    
}