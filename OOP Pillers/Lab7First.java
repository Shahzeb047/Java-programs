// Parent Class
class Parent {

    // Method of Parent class
    void parentMethod() {
        System.out.println("This is parent class");
    }
}

// Child Class (inherits Parent)
class Child extends Parent {

    // Method of Child class
    void childMethod() {
        System.out.println("This is child class");
    }
}

// Main Class
public class Lab7First {
    public static void main(String[] args) {

        // 1. Object of Parent class
        Parent p = new Parent();
        p.parentMethod();   // Calling parent method

        // 2. Object of Child class
        Child c = new Child();
        c.childMethod();    // Calling child method

        // 3. Calling parent method using child object
        c.parentMethod();   // Inherited from Parent
    }
}