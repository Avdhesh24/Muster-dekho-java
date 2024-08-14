import java.util.LinkedHashSet;
public class LearnLinkedHashSet {

        public static void main(String[] args) {

            // Create a LinkedHashSet to store unique elements
            LinkedHashSet<String> cities = new LinkedHashSet<>();

            // Add elements to the LinkedHashSet
            cities.add("New York");
            cities.add("London");
            cities.add("Paris");
            cities.add("Tokyo");
            cities.add("New York"); // Duplicate element

            // Print the LinkedHashSet
            System.out.println("Cities in LinkedHashSet: " + cities);
        }
    }

