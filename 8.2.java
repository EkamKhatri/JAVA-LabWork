public class ThrowExceptionDemo {
    public static void main(String[] args) {
        System.out.print("Ekam Khatri, 24csu335\n");
        try {
            throw new Exception("This is a custom exception message.");
        } 
        catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } 
        finally {
            System.out.println("Finally block executed successfully.");
        }
    }
}






