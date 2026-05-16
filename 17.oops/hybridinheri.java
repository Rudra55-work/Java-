public class hybridinheri {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();    // from Animal (single)
        d.play();   // from Pet (multiple)
        d.bark();   // own method

        Cat c = new Cat();
        c.eat();    // from Animal
        c.play();   // from Pet
        c.meow();   // own method
    }
}
// Parent class
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

// Interface (for multiple inheritance)
interface Pet {
    void play();
}

// Child class 1
class Dog extends Animal implements Pet {
    public void play() {
        System.out.println("Dog plays with ball");
    }
    void bark() {
        System.out.println("Dog barks");
    }
}

// Child class 2 (another hierarchy)
class Cat extends Animal implements Pet {
    public void play() {
        System.out.println("Cat plays with yarn");
    }
    void meow() {
        System.out.println("Cat meows");
    }
}



    

