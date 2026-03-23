class Student {

    // Instance Variables (object-based)
    String name;
    int age;
    // Static Variable (class-based)
    static String college;

    // Static Block (runs once when class loads)
    static {
        college = "FX College";
        System.out.println("Static block executed");
    }

    //  Static Method
    static void showCollege() {
        System.out.println("College: " + college);
    }
}

public class Seven {
    public static void main(String[] args) {

        // Creating objects
        Student s1 = new Student();
        s1.name = "Jumana";
        s1.age = 21;

        Student s2 = new Student();
        s2.name = "Haseen";
        s2.age = 21;

        // Instance variables
        System.out.println("Student 1: " + s1.name + ", " + s1.age);
        System.out.println("Student 2: " + s2.name + ", " + s2.age);
     
        // Static variable (same for all)
        System.out.println(s1.college);
        System.out.println(s2.college);
    
 
        // Static method call
        Student.showCollege();
    }
}