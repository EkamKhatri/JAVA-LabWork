import java.io.*;
import java.util.Scanner;
public class BufferedFileIO {
    public static void main(String[] args) {
        System.out.print("Ekam Khatri, 24csu335\n");
        Scanner sc = new Scanner(System.in);
        String filename = "students.txt";
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
            System.out.print("Enter number of students: ");
            int n = sc.nextInt();
            sc.nextLine(); 
            for (int i = 1; i <= n; i++) {
                System.out.println("\nEnter details for Student " + i + ":");
                System.out.print("Serial No: ");
                int sno = sc.nextInt();
                sc.nextLine();
                System.out.print("First Name: ");
                String name = sc.nextLine();
                System.out.print("CGPA: ");
                float cgpa = sc.nextFloat();
                System.out.print("Grade: ");
                char grade = sc.next().charAt(0);
                sc.nextLine();

                bw.write(sno + "," + name + "," + cgpa + "," + grade);
                bw.newLine();
            }
            bw.close();
            System.out.println("\nData written successfully. Displaying contents:\n");
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
