class Method {
    int id;
    String name;
    int age;

    void Student() {
        id = 0;
        name = "Unknown";
        age = 0;
    }

    void Student(int i, String n) {
        id = i;
        name = n;
    }

    void Student(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println("ID: " + id + " Name: " + name + " Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(112, "Saptarsi");
        Student s3 = new Student(145, "Puspal", 20);

        s1.display();
        s2.display();
        s3.display();
    }
}