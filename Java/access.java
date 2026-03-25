class AccessDemo {

    public int a = 10;      // Public
    private int b = 20;     // Private
    protected int c = 30;   // Protected
    int d = 40;             // Default

    void show() {
        System.out.println("Inside class:");
        System.out.println("Public: " + a);
        System.out.println("Private: " + b);
        System.out.println("Protected: " + c);
        System.out.println("Default: " + d);
    }
}

public class access {
    public static void main(String[] args) {

        AccessDemo obj = new AccessDemo();

        // Accessible here (same package)
        System.out.println("Public: " + obj.a);
        // System.out.println("Private: " + obj.b); ERROR
        System.out.println("Protected: " + obj.c);
        System.out.println("Default: " + obj.d);

        obj.show(); // accessing all inside class
    }
}