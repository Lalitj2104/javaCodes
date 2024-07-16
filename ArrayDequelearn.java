import java.util.*;

public class ArrayDequelearn {
    public static void main(String[]args){

        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(10);
        adq.offerLast(40);
        adq.offerFirst(20);
        System.out.println(adq);

        System.out.println(adq.pollFirst());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

    }    
}
