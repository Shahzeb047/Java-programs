// Base Class
class Base {
    String name;

    // Default Constructor
    Base() {
        System.out.println("Base Default Constructor Called");
    }

    // Parameterized Constructor
    Base(String name) {
        this.name = name;
        System.out.println("Base Parameterized Constructor Called: " + name);
    }
}

// Derived Class
class Derived extends Base {

    // Default Constructor
    Derived() {
        super(); // calls Base default constructor
        System.out.println("Derived Default Constructor Called");
    }

    // Parameterized Constructor
    Derived(String name) {
        super(name); // calls Base parameterized constructor
        System.out.println("Derived Parameterized Constructor Called");
    }
}

// Main Class
public class Lab7Five {
    public static void main(String[] args) {

        System.out.println("Creating object with default constructor:");
        Derived d1 = new Derived();

        System.out.println("\nCreating object with parameterized constructor:");
        Derived d2 = new Derived("Ali");
    }
}