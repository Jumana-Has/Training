// Interface
interface Animal {
    void sound();   // abstract method
    void eat();     // abstract method
}

// Class implementing interface
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }

    public void eat() {
        System.out.println("Dog eats food");
    }
}

// Another class implementing same interface
class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }

    public void eat() {
        System.out.println("Cat drinks milk");
    }
}

// Main class
public class inter {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.sound();
        a1.eat();

        Animal a2 = new Cat();
        a2.sound();
        a2.eat();
    }
}