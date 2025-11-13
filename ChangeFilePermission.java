import java.io.File;
import java.util.Scanner;
public class ChangeFilePermission {
    public static void main(String[] args) {
        System.out.print("Ekam Khatri, 24csu335\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String path = sc.nextLine();
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("File does not exist.");
        } else {
            System.out.print("Set file to read-only? (yes/no): ");
            String response = sc.nextLine().trim().toLowerCase();
            if (response.equals("yes")) {
                boolean success = file.setReadOnly();
                System.out.println(success ? "File set to read-only." : "Failed to change permission.");
            } else {
                boolean success = file.setWritable(true);
                System.out.println(success ? "File set to writable." : "Failed to change permission.");
            }
        }
        sc.close();
    }
}

