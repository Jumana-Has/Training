import java.util.*;

public class Collection{
    public static void main(String[] args) {

        //  LIST
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple"); // duplicates allowed

        System.out.println("List: " + list);

        // SET
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // duplicate ignored

        System.out.println("Set: " + set);

        //  QUEUE
        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        System.out.println("Queue before poll: " + queue);
        queue.poll(); // removes first element
        System.out.println("Queue after poll: " + queue);

        //  MAP
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4,"FOUR");

        System.out.println("Map: " + map);
        System.out.println("Value for key 2: " + map.get(2));
        System.err.println("Value of k 1:"+map.get(1));
    }
}