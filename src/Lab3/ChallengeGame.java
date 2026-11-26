
package Lab3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ChallengeGame {
    
public static void main(String[] args) {

    File file = new File("scores.txt");

    if (!file.exists()) {
        System.out.println("Sorry, scores.txt does not exist.");
        System.out.println("Please create the file and try again.");
        return;
    }

    try (Scanner input = new Scanner(file)) {

        int sum = 0;
        int largest = Integer.MIN_VALUE;
        int count = 0;

        while (input.hasNextInt()) {
            int score = input.nextInt();

            sum += score;

            if (score > largest) {
                largest = score;
            }

            count++;
        }

        if (count == 0) {
            System.out.println("No scores were found in the file.");
            return;
        }

        double average = (double) sum / count;

        System.out.println("Sum: " + sum);
        System.out.println("Largest Score: " + largest);
        System.out.println("Average: " + average);

    } catch (FileNotFoundException e) {
        System.out.println("Unable to open scores.txt.");
    }
}
}
