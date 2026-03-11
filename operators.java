public class operators {
    public static void main(String[] args) {

        int a = 10, b = 5;

        // 1. Arithmetic Operators
        System.out.println("Arithmetic:");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // 2. Relational Operators
        System.out.println("\nRelational:");
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);

        // 3. Logical Operators
        System.out.println("\nLogical:");
        System.out.println(a > b && b > 2);
        System.out.println(a > b || b > 10);
        System.out.println(!(a > b));

        // 4. Assignment Operators
        int c = 10;
        c += 5;
        System.out.println("\nAssignment: " + c);

        // 5. Increment / Decrement
        int d = 5;
        d++;
        d--;
        System.out.println("Increment/Decrement: " + d);

        // 6. Bitwise Operators
        System.out.println("\nBitwise:");
        System.out.println(a & b);
        System.out.println(a | b);

        // 7. Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("\nTernary Max: " + max);
    }
}