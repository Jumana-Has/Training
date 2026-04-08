// Demonstrating Inheritance in Java

// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Main class
public class inherit{
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound(); // inherited method
        d.bark();  // child class method
    }
}