// Parent Class
class Parent {
    void show() {
        System.out.println("This is Parent class show method");
    }
}

// Child Class
class Child extends Parent {
    @Override
    void show() {
        System.out.println("This is Child class show method");
    }
}

// GrandChild Class
class GrandChild extends Child {
    @Override
    void show() {
        System.out.println("This is GrandChild class show method");
    }

    void grandChildShow() {
        System.out.println("This is GrandChild specific method");
    }
}

// Main Class
public class Lab8Third{
    public static void main(String[] args) {

        Parent obj = new GrandChild();  // Parent reference, GrandChild object

        obj.show();  // Calls GrandChild version (Polymorphism)

        // obj.grandChildShow(); ❌ ERROR (not accessible)

        // To access grandChildShow()
        GrandChild gc = (GrandChild) obj; // Downcasting
        gc.grandChildShow();
    }
}