import java.util.*;
public class queue {
    //max heap
    public static void main(String[] args) {
        Queue <Integer> q= new PriorityQueue<>(Comparator.reverseOrder());

        q.offer(10);
        q.offer(80);
        q.offer(30);
        q.offer(60);
        System.out.println(q);
        System.out.println(q.poll());

    }
}
