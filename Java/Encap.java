class Student {
    private String name;   // encapsulated variable

    // setter method
    public void setName(String name) {
        this.name = name;
    }

    // getter method
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Jumana");
        System.out.println(s.getName());
    }
}