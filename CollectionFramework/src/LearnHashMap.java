import java.util.HashMap;

public class LearnHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> studentMap = new HashMap<>();

        // Add key-value pairs (ID, Name) to the HashMap
        studentMap.put(101, "Avdhesh");
        studentMap.put(102, "Sagar");
        studentMap.put(103, "Tanmay");
        studentMap.put(104, "Aakash");

        // Print the HashMap
        System.out.println("Student HashMap: " + studentMap);

        // Accessing a value by its key
        String studentName = studentMap.get(102);
        System.out.println("Student with ID 102: " + studentName);

        // Removing a key-value pair
        studentMap.remove(103);

        // Print the HashMap after removal
        System.out.println("After removing ID 103: " + studentMap);

        // Iterating through the HashMap
        System.out.println("Iterating through the HashMap:");
        for (Integer id : studentMap.keySet()) {
            System.out.println("ID: " + id + ", Name: " + studentMap.get(id));
        }
    }
}
