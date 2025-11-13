public class exp6_2 {
    public static void main(String[] args) {
        System.out.print("Ekam Khatri, 24csu335\n");
        Circle circle = new Circle(5.0);
                System.out.println("\nCircle:");
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());
                ResizableCircle resizableCircle = new ResizableCircle(5.0);
                System.out.println("\nResizable Circle (Before Resize):");
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());
        System.out.println("Area: " + resizableCircle.getArea());
                resizableCircle.resize(50);
                System.out.println("\nResizable Circle (After Resize):");
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());
        System.out.println("Area: " + resizableCircle.getArea());
    }
}

