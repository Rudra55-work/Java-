public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Alice");
        Student s3 = new Student(101);
    }
    
}

class Student {
    String name;
    int age;
    int roll;

    // non-Constructor
    Student() {
        System.out.println("Constructor called");
    }
    // Parameterized Constructor`
    Student(String name) {
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}
    
    


