// Parent Class
class Rectangle {
    private double height;
    private double width;

    // Constructor
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    // Getters
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    // Setters
    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Method to calculate area
    public double computeSurfaceArea() {
        return height * width;
    }

    // toString method
    public String toString() {
        return "Rectangle [Height=" + height + ", Width=" + width + "]";
    }
}

// Child Class
class RectPrism extends Rectangle {
    private double depth;

    // Constructor
    public RectPrism(double height, double width, double depth) {
        super(height, width);
        this.depth = depth;
    }

    // Getter
    public double getDepth() {
        return depth;
    }

    // Setter
    public void setDepth(double depth) {
        this.depth = depth;
    }

    // Method to calculate volume
    public double computeVolume() {
        return getHeight() * getWidth() * depth;
    }

    // Override surface area
    @Override
    public double computeSurfaceArea() {
        double h = getHeight();
        double w = getWidth();
        double d = depth;
        return 2 * (h*w + h*d + w*d);
    }

    // Override toString
    @Override
    public String toString() {
        return "Rectangular Prism [Height=" + getHeight() +
               ", Width=" + getWidth() +
               ", Depth=" + depth + "]";
    }
}

// Demo Class
public class Lab7FourRectangle {
    public static void main(String[] args) {

        // Rectangle object
        Rectangle rect = new Rectangle(5, 10);
        System.out.println(rect);
        System.out.println("Rectangle Area: " + rect.computeSurfaceArea());

        System.out.println("--------------------------");

        // Rectangular Prism object
        RectPrism prism = new RectPrism(5, 10, 3);
        System.out.println(prism);
        System.out.println("Surface Area: " + prism.computeSurfaceArea());
        System.out.println("Volume: " + prism.computeVolume());
    }
}