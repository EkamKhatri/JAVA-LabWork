public class Circle implements GeometricObject {
    private double radius = 1.0; // Making radius private

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter method for radius (optional, in case you need to access radius)
    public double getRadius() {
        return radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
