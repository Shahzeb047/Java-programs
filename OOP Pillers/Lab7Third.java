// Parent Class
class Rectangle{
    int length;
    int breadth;
                  
    // Constructor
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to print area
    void printArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }

    // Method to print perimeter
    void printPerimeter() {
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter: " + perimeter);
    }
}

// Child Class
class Square extends Rectangle {

    // Constructor
    Square(int s) {
        super(s, s); // Calling parent constructor
    }
}

// Main Class
public class Lab7Third{
    public static void main(String[] args) {

        // Rectangle Object
        Rectangle rect = new Rectangle(10, 5);
        System.out.println("Rectangle:");
        rect.printArea();   
        rect.printPerimeter();

        System.out.println();

        // Square Object
        Square sq = new Square(4);
        System.out.println("Square:");
        sq.printArea();
        sq.printPerimeter();
    }
}