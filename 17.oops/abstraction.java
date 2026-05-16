public class abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println(h.color);
    }
    
}

abstract class Animal{
    //constructor animal class
    String color;
    Animal(){
        System.out.println("Animal constructor called");
    }

    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}

class Horse extends Animal{
    void changecolor(){
        color = "brown";
    }
    void walk(){
        System.out.println("Horse walks on 4 legs");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("Chicken walks on 2 legs");
    }
}
