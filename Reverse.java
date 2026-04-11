// LOOP REVERSE
// import java.util.*;
// public class reversearray {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int arr[] = new int[num];
//         for(int i=0; i<num; i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=num-1; i>=0; i--){
//             System.out.print(arr[i] + " ");
//         }
//         sc.close();
//     }
// }
import java.util.*;

public class Reverse{

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=obj.nextInt();
		}
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		System.out.println("Reversed Array");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
		}

	}

}