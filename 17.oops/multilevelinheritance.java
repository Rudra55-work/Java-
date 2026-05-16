public class multilevelinheritance {

    public static void main(String[] args) {
        Puppy p = new Puppy();

        p.eat();   // from Animal
        p.bark();  // from Dog
        p.weep();  // from Puppy
    }
}
    // Parent class (Grandparent)
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Child class (Parent)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Child of Dog (Grandchild)
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is crying");
    }
}



    

