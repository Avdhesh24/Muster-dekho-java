import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // queue.offer() Use for insert the element in queue
        queue.offer(12);
        queue.offer(11);
        queue.offer(121);
        queue.offer(122);
        queue.offer(123);

        System.out.println(queue);

        // queue.poll() is used for remove the element is queue
        System.out.println(queue.poll());

        // queue.peek() is used for print top element
        System.out.println(queue.peek());
    }
}
