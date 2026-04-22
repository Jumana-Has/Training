import java.io.*;

// Custom Exception
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class ExceptionDemo {

    // Method with throws
    static void readFile() throws IOException {
        FileReader file = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(file);
        System.out.println("File opened successfully");
        br.close();
    }

    public static void main(String[] args) {

        // 1. Try-Catch (Arithmetic Exception)
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }

        // 2. Multiple Catch
        try {
            int arr[] = new int[3];
            arr[5] = 100;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Error");
        }

        // 3. Finally Block
        try {
            int b = 5 / 0;
        } catch (Exception e) {
            System.out.println("Exception handled");
        } finally {
            System.out.println("Finally block executed");
        }

        // 4. Throw keyword
        try {
            throw new ArithmeticException("Manual Exception thrown");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // 5. Throws keyword
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File not found or error reading file");
        }

        // 6. Custom Exception
        try {
            int age = 15;
            if (age < 18) {
                throw new MyException("Age must be 18 or above");
            }
        } catch (MyException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }

        System.out.println("Program continues normally...");
    }
}