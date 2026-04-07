class StudentManager {

    // Constant (UPPER_CASE)
    static final int MAX_STUDENTS = 50;

    // Variable (camelCase)
    String studentName;

    // Embedded Interface (PascalCase)
    interface StudentService {
        void addStudent(String name);
    }

    // Method (camelCase)
    public void displayStudent() {
        System.out.println("Student: " + studentName);
    }

    public static void main(String[] args) {
        StudentManager obj = new StudentManager();
        obj.studentName = "Jumana";
        obj.displayStudent();
    }
}