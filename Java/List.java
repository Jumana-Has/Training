import java.util.*;

public class List{
    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        //  Vector
        Vector<String> vector = new Vector<>();
        vector.add("Dog");
        vector.add("Cat");
        vector.add("cow");

        //  LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Blue");

        //  Print all
        System.out.println("ArrayList: " + arrayList);
        System.out.println("Vector: " + vector);
        System.out.println("LinkedList: " + linkedList);

        // Access elements
        System.out.println("ArrayList first: " + arrayList.get(0));
        System.out.println("Vector first: " + vector.get(0));
        System.out.println("LinkedList first: " + linkedList.get(0));

        // Remove element
        arrayList.remove("Banana");
        vector.remove("Cat");
        linkedList.remove("Green");

        System.out.println("\nAfter Removal:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("Vector: " + vector);
        System.out.println("LinkedList: " + linkedList);
    }
}