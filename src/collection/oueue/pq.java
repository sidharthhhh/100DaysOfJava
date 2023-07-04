package collection.oueue;
import java.util.Queue;
import java.util.Comparator;
import java.util.PriorityQueue;

public class pq {
    public static void main(String[] args) {
        // Queue<Integer> parityQ = new PriorityQueue<>();
        Queue<Integer> parityQ = new PriorityQueue<>(Comparator.reverseOrder()); // reverse kar deta hai queue ko....decending order

            parityQ.offer(432);
            parityQ.offer(324);
            parityQ.offer(43);
            parityQ.offer(23);
            parityQ.offer(234);

            System.out.println(parityQ);
            
            parityQ.poll();  // aage ke elements hatata haiii
            System.out.println(parityQ);
            
            System.out.println(parityQ.peek());
    }
    
}
