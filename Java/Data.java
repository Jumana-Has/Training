import java.util.Arrays;

public class Data {

    // Simple class for Object demonstration
    static class Student {
        String studentName = "Jumana";
    }

    public static void main(String[] args) {

        // -------- Primitive Data Types --------
        byte aByte = 100;
        short aShort = 10000;
        int anInt = 50000;
        long aLong = 1000000L;
        float aFloat = 10.5f;
        double aDouble = 3.14159;
        char aChar = 'J';
        boolean aBoolean = true;

        // -------- Non-Primitive Data Types --------
        String name = "Jumana Haseen";
        int[] numbers = {1, 2, 3, 4, 5};
        Student s = new Student();  // Object type

        // -------- Displaying Data --------
        System.out.println("---- Primitive Data Types ----");
        System.out.printf("byte: %d, short: %d, int: %d, long: %d%n", aByte, aShort, anInt, aLong);
        System.out.printf("float: %.2f, double: %.5f, char: %c, boolean: %b%n", aFloat, aDouble, aChar, aBoolean);

        System.out.println("\n---- Non-Primitive Data Types ----");
        System.out.println("String: " + name);
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Object (Student name): " + s.studentName);
    }
}