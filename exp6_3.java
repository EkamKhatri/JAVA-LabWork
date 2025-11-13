abstract class Shape {
    abstract void RectangleArea(double length, double breadth);
    abstract void SquareArea(double side);
    abstract void CircleArea(double radius);
}
class Area extends Shape {
    void RectangleArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Rectangle Area: " + area);
    }
    void SquareArea(double side) {
        double area = side * side;
        System.out.println("Square Area: " + area);
    }
    void CircleArea(double radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}
public class exp6_3 {
    public static void main(String[] args) {
        System.out.print("Ekam Khatri, 24csu335\n");
        Area a = new Area();
        a.RectangleArea(5, 10);
        a.SquareArea(7);
        a.CircleArea(3);
    }
}

