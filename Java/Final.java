interface Vehicle {

    // final variable (by default public static final)
    int speedLimit = 120;

    void start();

    // Embedded class inside interface
    class Engine {
        final String type = "Petrol";

        final void engineInfo() {
            System.out.println("Engine Type: " + type);
        }
    }
}

// Implementing class
class Car implements Vehicle {

    public void start() {
        System.out.println("Car starts with speed limit: " + speedLimit);
    }
}

// Main class
public class Final{
    public static void main(String[] args) {

        Car c = new Car();
        c.start();

        // Access embedded class
        Vehicle.Engine e = new Vehicle.Engine();
        e.engineInfo();
    }
}