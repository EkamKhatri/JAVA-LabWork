import java.util.Scanner;
class CustomStringException extends Exception {
    String message;
    CustomStringException(String msg) {
        this.message = msg;
    }
    void printMessage() {
        System.out.println("Custom Exception Message: " + message);
    }
}
public class CustomStringExceptionDemo {
    public static void main(String[] args) {
        System.out.print("Ekam Khatri, 24csu335\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String input = sc.nextLine(); 
        try {
            throw new CustomStringException(input);
        } 
        catch (CustomStringException e) {
            e.printMessage();
        }
        finally {
            sc.close();
        }
    }
}
