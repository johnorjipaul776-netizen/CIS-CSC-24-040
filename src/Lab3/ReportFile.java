
package Lab3;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class ReportFile {
    
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    try {
        FileWriter writer = new FileWriter("names.txt");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter name " + i + ": ");
            String name = input.nextLine();

            writer.write(i + ". " + name + "\n");
        }

        writer.close();

        System.out.println("Five names successfully saved to names.txt");

    } catch (IOException e) {
        System.out.println("Sorry, an error occurred while writing the file.");
    }

    input.close();
}
}
