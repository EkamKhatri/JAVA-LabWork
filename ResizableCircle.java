public class ResizableCircle extends Circle implements Resizable {
    
    // Constructor
    public ResizableCircle(double radius) {
        super(radius);  // Calls Circle constructor
    }

    @Override
    public void resize(int percent) {
        // Resizes the radius by a percentage
        double newRadius = getRadius() * (1 + percent / 100.0);
        // Assuming you want to update the radius after resize
        // This sets the updated radius in the parent class
        try {
            java.lang.reflect.Field radiusField = Circle.class.getDeclaredField("radius");
            radiusField.setAccessible(true); // Make private field accessible
            radiusField.set(this, newRadius);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
