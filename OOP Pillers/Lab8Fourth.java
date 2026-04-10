// Parent Class (Father)
class Father {

    void home() {
        System.out.println("This is Father's home");
    }

    void car() {
        System.out.println("Father has a Car");
    }
}

// Child Class (Son)
class Son extends Father {

    // Overriding car() method
    @Override
    void car() {
        System.out.println("Son has his own Car");
    }
}

// Main Class
public class Lab8Fourth {
    public static void main(String[] args) {

        Son s = new Son();

        s.home(); // Inherited from Father
        s.car();  // Overridden by Son
    }
}