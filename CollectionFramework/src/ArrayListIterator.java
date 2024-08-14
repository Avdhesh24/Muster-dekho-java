import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIterator {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);
        list.add(900);

        System.out.println(list);

        //Fist step use for loop
        for(int i = 0; i < list.size(); i++){
            System.out.println("The element is" + list.get(i));
        }

        // Second for each loop
        for(Integer element : list){
            System.out.println("for each element is" + element);
        }

        // Third is Iterator case

        Iterator<Integer> it =list.iterator();
        while (it.hasNext()){
            System.out.println("Iterator" + it.next());
        }


    }
}