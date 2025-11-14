// Parent class
class Animal {
    void eat() {
        System.out.println("Animals can eat");
    }
}

// Child class (inherits Animal)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat(); // inherited method
        d.bark(); // own method
    }
}
