import java.util.*;

class Student implements Comparable<Student> {
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // Comparable → default sort by age
    public int compareTo(Student s) {
        return this.age - s.age;
    }
}

public class Compare {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(22, "J"));
        list.add(new Student(24, "A"));
        list.add(new Student(23, "B"));

        // 🔹 Default sorting (Comparable)
        Collections.sort(list);
        System.out.println("Sort by Age:");
        for (Student s : list) {
            System.out.println(s.age + " " + s.name);
        }

        // 🔹 Custom sorting (Comparator)
        Collections.sort(list, (s1, s2) -> s1.name.compareTo(s2.name));
        System.out.println("\nSort by Name:");
        for (Student s : list) {
            System.out.println(s.age + " " + s.name);
        }
    }
}