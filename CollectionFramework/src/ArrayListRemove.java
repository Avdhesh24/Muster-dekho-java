import java.util.ArrayList;
import java.util.List;

public class ArrayListRemove {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);

        System.out.println(list);

        list.remove(3);  // This will remove index 3 means 40
        System.out.println(list);

        list.remove(Integer.valueOf(60)); // This will remove 60 in the list
        System.out.println(list);

        //list.clear();     // This will clear all the array list
        //System.out.println(list);


        list.set(2,1000);
        System.out.println(list);



    }
}
