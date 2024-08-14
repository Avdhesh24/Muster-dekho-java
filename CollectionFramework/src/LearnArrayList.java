import java.sql.SQLOutput;
import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args) {
        // Create an ArrayList to store strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Print the ArrayList
        System.out.println("Fruits in the list: " + fruits);

        // Adding more elements
        fruits.add("Grapes");
        fruits.add("Pineapple");

        // Print the ArrayList again
        System.out.println("Updated list of fruits: " + fruits);

        // Watermelon add in 2 Array Position
        fruits.add(2,"Watermelon");

        System.out.println("Updated list of fruits: " + fruits);

        // Create an another ArrayList to store strings
        ArrayList<String> newfruits = new ArrayList<>();

        fruits.add("papaya");
        fruits.add("Guava");

        fruits.addAll(newfruits);

        System.out.println("Updated list of fruits: " + fruits);


        //using get function
        System.out.println(fruits.get(4));





    }
}

