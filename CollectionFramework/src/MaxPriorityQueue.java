import java.util.Comparator;
import java.util.PriorityQueue;
public class MaxPriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(111);
        pq.offer(222);
        pq.offer(333);
        pq.offer(444);
        pq.offer(555);

        System.out.println(pq);

        // remove max element
        pq.poll();
        System.out.println(pq);
        // show next remove element
        System.out.println(pq.peek());


    }
}
