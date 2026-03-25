class MethodsDemo {

    // 1. Simple Method (no return, no parameter)
    void greet() {
        System.out.println("Hello!");
    }

    // 2. Method with parameters
    void displaySum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // 3. Method with return type
    int add(int a, int b) {
        return a + b;
    }

    // 4. Static method
    static void showMessage() {
        System.out.println("This is a static method");
    }

    // 5. Method Overloading
    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // 6. Recursive method
    int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    // MAIN METHOD
    public static void function(String[] args) {

        MethodsDemo obj = new MethodsDemo();

        // calling simple method
        obj.greet();

        // calling parameter method
        obj.displaySum(5, 3);

        // calling return method
        int result = obj.add(10, 20);
        System.out.println("Addition: " + result);

        // calling static method
        showMessage();

        // method overloading
        System.out.println("Multiply (2 values): " + obj.multiply(2, 3));
        System.out.println("Multiply (3 values): " + obj.multiply(2, 3, 4));

        // recursion
        System.out.println("Factorial: " + obj.factorial(5));
    }
}