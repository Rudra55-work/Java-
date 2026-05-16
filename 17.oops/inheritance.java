public class inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
        d1.breathe();
        
    }
    
}// Base class
class Animal {
    String color;
    void eat() {
        System.out.println("Eating...");
    }

    void breathe() {
        System.out.println("Breathing...");
    }
}
// Derived class
class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}