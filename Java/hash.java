import java.util.*;

public class hash {
    public static void main(String[] args) {

        // HashSet
        HashSet<Integer> hs = new HashSet<>();
        hs.add(30);
        hs.add(10);
        hs.add(20);
        hs.add(10); // duplicate

        //  LinkedHashSet
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(30);
        lhs.add(10);
        lhs.add(20);
        lhs.add(10); // duplicate

        //  TreeSet
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(30);
        ts.add(10);
        ts.add(20);
        // ts.add(null); //  will throw error

        //  Print all
        System.out.println("HashSet: " + hs);
        System.out.println("LinkedHashSet: " + lhs);
        System.out.println("TreeSet: " + ts);

        //  Common operations
        hs.remove(10);
        lhs.contains(20);
        ts.first();
        ts.last();

        System.out.println("\nAfter operations:");
        System.out.println("HashSet: " + hs);
        System.out.println("LinkedHashSet: " + lhs);
        System.out.println("TreeSet: " + ts);
    }
}