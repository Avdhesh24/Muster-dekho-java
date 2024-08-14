import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class MinPriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //offer() is used for adding the elemet is queue
        pq.offer(1000);
        pq.offer(1001);
        pq.offer(1010);
        pq.offer(1100);
        System.out.println(pq);

        //poll() is used for remove element in this scenario min element is remove
        pq.poll();
        System.out.println(pq);

        // peek() is used for remove next min element
        System.out.println(pq.peek());
    }
}
