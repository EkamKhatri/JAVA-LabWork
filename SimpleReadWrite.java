import java.io.*;
import java.util.Scanner;
public class SimpleReadWrite {
    public static void main(String[] args) {
        System.out.print("Ekam Khatri, 24csu335\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String filename = sc.nextLine();
        try {
            FileWriter writer = new FileWriter(filename);
            System.out.println("Enter text to write into file (type 'stop' to end):");
            while (true) {
                String line = sc.nextLine();
                if (line.equalsIgnoreCase("stop")) break;
                writer.write(line + System.lineSeparator());
            }
            writer.close();
            System.out.println("\nData written successfully.\nReading from file:");
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String content;
            while ((content = reader.readLine()) != null) {
                System.out.println(content);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
