class Student {

    String name;
    int age;

    // Default constructor
    Student() {
        name = "Jumana";
        age = 0;
    }

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Student s1 = new Student();          // default constructor
        Student s2 = new Student("Haseen",22); // parameterized constructor

        s1.display();
        s2.display();
    }
}