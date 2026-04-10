// Base Class
class Animal {
    void makeNoise() {
        System.out.println("Animals make sounds");
    }
}

// Child Class 1 - Cat
class Cat extends Animal {
    @Override
    void makeNoise() {
        System.out.println("Meow");
    }
}

// Child Class 2 - Dog
class Dog extends Animal {
    @Override
    void makeNoise() {
        System.out.println("Bark");
    }
}

// Main Class
public class Lab8Second {
    public static void main(String[] args) {
        
        Animal a1 = new Cat();  // Polymorphism
        Animal a2 = new Dog();

        a1.makeNoise(); // Calls Cat's method
        a2.makeNoise(); // Calls Dog's method
    }
}