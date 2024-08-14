import java.util.Set;
import java.util.TreeSet;
public class LearnTreeSet {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements to the TreeSet
        numbers.add(250);
        numbers.add(100);
        numbers.add(15);
        numbers.add(50);
        numbers.add(20);
        System.out.println("Numbers in TreeSet (sorted order): " + numbers);

        // Add a duplicate element
        numbers.add(15); // This will not change the set as 15 is already present

        // Print the TreeSet again
        System.out.println("After trying to add duplicate: " + numbers);

        // Accessing the first and last elements
        System.out.println("First element: " + numbers.first());
        System.out.println("Last element: " + numbers.last());
    }
}