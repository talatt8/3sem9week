class Shape {

    // Area of Square
    void area(int side) {
        System.out.println("Area of Square: " + (side * side));
    }

    // Area of Rectangle
    void area(int length, int breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    // Area of Circle
    void area(double radius) {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}

// Main Class to Test
public class task8 {
    public static void main(String[] args) {

        Shape s = new Shape();

        s.area(5);          // Square
        s.area(4, 6);       // Rectangle
        s.area(3.5);        // Circle
    }
}

