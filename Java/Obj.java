class Person {

    // Variables (Instance variables)
    String name;
    int age;

    // Default Constructor
    Person() {
        name = "Jumana";
        age = 21;
    }

    // Parameterized Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method to update details
    void update(String n, int a) {
        name = n;
        age = a;
    }
}

public class Obj{
    public static void main(String[] args) {

        // Object 1 → uses default constructor
        Person p1 = new Person();
        p1.display();

        System.out.println("----- After Update -----");
        p1.update("Jumana", 21);
        p1.display();

        System.out.println("==========");

        // Object 2 → uses parameterized constructor
        Person p2 = new Person("Haseen", 21);
        p2.display();
    }
}