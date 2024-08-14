import java.util.ArrayDeque;
public class LearnArrayDeque {

    public static void main(String[] args) {

        ArrayDeque<Integer> aq = new ArrayDeque<>();

        // Add element in queue
        aq.offer(120);
        aq.offerFirst(121);
        aq.offer(122);
        aq.offerLast(123);
        aq.offer(1000);
        System.out.println(aq);

        // Peek element in queue
        System.out.println(aq.peek());
        System.out.println(aq.peekFirst());
        System.out.println(aq.peekLast());

        // Remove the element in a queue
        System.out.println(aq.poll());
        System.out.println("poll() " + aq);

        System.out.println(aq.pollFirst());
        System.out.println("pollfirst() " + aq);

        System.out.println(aq.pollLast());
        System.out.println("polllast:" + aq);
    }
}
