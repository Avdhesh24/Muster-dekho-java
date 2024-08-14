import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        //Set is used for add the element
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(500);

        System.out.println(set);

        //Set.remove is remove particular object
        set.remove(300);
        System.out.println(set);

        // set.contains is check object is present or not if yes so true otherwise false
        System.out.println(set.contains(200));

        // set.isempty is check list is empty on not
        System.out.println(set.isEmpty());

        // set.size is used for check size
        System.out.println(set.size());

    }
}
