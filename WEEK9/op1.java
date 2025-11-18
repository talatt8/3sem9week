class Shape{
    void area(){
       System.out.println("Area...");
   }
}
class Rectangle extends Shape{
    int length;
    int breadth;
    @Override
    void area(){
        int area = length*breadth;
        System.out.println("Area of rectangle = "+ area);
    }
}
class Circle extends Shape{
    double radius;
    @Override
    void area(){
        double area = 3.14*Math.pow(radius,2);
        System.out.println("Area of circle = " + area);
    }
}
public class op1 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 10;
        r.breadth = 2;
        r.area();
        Circle c = new Circle();
        c.radius = 5;
        c.area();

    }
}







