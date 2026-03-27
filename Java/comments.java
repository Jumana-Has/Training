/**
 * Class: Calculator
 * This class performs basic math operations
 * @author Jumana
 * @version 1.0
 */
class comments{

    // This method prints a welcome message
    void greet() {
        System.out.println("Welcome to Calculator");
    }

    /**
     * Adds two numbers
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    int add(int a, int b) {
        return a + b; // returning result
    }

    /*
     * This method multiplies two numbers
     */
    int multiply(int x, int y) {
        return x * y;
    }


int sub(int A,int B){
    return A-B;
}

    public static void main(String[] args) {
     comments obj = new comments(); // object creation

        obj.greet(); // calling greet method

        int sum = obj.add(5, 3); // calling add method
        System.out.println("Sum: " + sum);

        int product = obj.multiply(4, 2);
        System.out.println("Product: " + product);

        int sub = obj.sub(2,8);
        System.err.println("sub:"+sub);
    }
}