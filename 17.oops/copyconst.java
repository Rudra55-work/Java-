public class copyconst {
        public static void main(String[] args) {

        Student s1 = new Student("Rudra", 20);

        // Create copy using copy constructor
        Student s2 = new Student(s1);

        System.out.println(s2.name);
        System.out.println(s2.age);
    }
}
class Student {
    String name;
    int age;

    // Normal constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }
}

