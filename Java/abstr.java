abstract class Animal {

    // Embedded Interface
    interface AnimalCare {
        void vaccinate();
    }

    // Abstract method
    abstract void sound();

    // Concrete method
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Subclass extending abstract class and implementing inner interface
class Dog extends Animal implements Animal.AnimalCare {

    // Implement abstract method
    void sound() {
        System.out.println("Dog barks");
    }

    // Implement interface method
    public void vaccinate() {
        System.out.println("Dog is vaccinated");
    }
}

public class abstr {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();       // abstract method
        d.eat();         // concrete method
        d.vaccinate();   // interface method
    }
}