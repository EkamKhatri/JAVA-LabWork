class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}
public class CommandLineSum {
    public static void main(String[] args) {
        System.out.print("Ekam Khatri, 24csu335\n");
        try {
            if (args.length < 5) {
                throw new CheckArgumentException("Less than five arguments passed!");
            }
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += Integer.parseInt(args[i]);
            }
            System.out.println("Sum of 5 numbers = " + sum);
        } 
        catch (CheckArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } 
        catch (NumberFormatException e) {
            System.out.println("Please enter only integer values!");
        }
    }
}



