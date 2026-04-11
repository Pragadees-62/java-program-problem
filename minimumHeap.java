import java.util.*;
public class minimumHeap{
    public static void main(String[] args) {
        PriorityQueue<Integer>praga=new PriorityQueue<>();
        praga.add(2);
        praga.offer(4);
        praga.offer(5);
        praga.add(1);
        praga.offer(3);
        praga.add(9);
        praga.offer(8);
        System.out.println(praga);
        praga.poll();
        System.out.println(praga);
        praga.peek();
        System.out.println(praga);
        praga.element();
        System.out.println(praga);
    }
}
// import java.util.*;
// public class minimumHeap{
//     public static void main(String[] args) {
//         PriorityQueue<Integer>praga=new PriorityQueue<>(Collections.reverseOrder());
//         praga.add(2);
//         praga.offer(4);
//         praga.offer(5);
//         praga.add(1);
//         praga.offer(3);
//         System.out.println(praga);
//         praga.poll();
//         System.out.println(praga);
//         praga.peek();
//         System.out.println(praga);
//         praga.element();
//         System.out.println(praga);
//     }
// }