import java.sql.SQLOutput;
import java.util.Stack;
public class LearnStack {
    public static void main(String[] args) {

        Stack<String> animals = new Stack<>();

        // push is used for insert the value in stack
        animals.push("lion");
        animals.push("cat");
        animals.push("Tiger");
        animals.push("Dog");
        animals.push("Horsh");
        animals.push("cow");
        animals.push("Goat");

        System.out.println("Stack:" + animals);

        //peek use for show top first element
        System.out.println(animals.peek());

        //pop used for remove first element means goat will be remove and cow will show
        animals.pop();
        System.out.println(animals.peek());
    }
}
