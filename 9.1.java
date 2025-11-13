import java.io.File;
import java.util.Scanner;
public class FileCheckProgram {
    public static void main(String[] args) {
        System.out.print("Ekam Khatri, 24csu335\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file or directory path: ");
        String path = sc.nextLine();
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("The specified path does not exist.");
        } else if (file.isFile()) {
            System.out.println("The path refers to a file.");
        } else if (file.isDirectory()) {
            System.out.println("The path refers to a directory.");
        }
        sc.close();
    }
}

