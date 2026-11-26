package Lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTotals {
public static void main(String[] args) {

    File file = new File("scores.txt");

    try {
        Scanner input = new Scanner(file);

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

        if (count > 0) {
            double average = (double) sum / count;

            System.out.println("Sum: " + sum);
            System.out.println("Largest Score: " + largest);
            System.out.println("Average: " + average);
        } else {
            System.out.println("The file contains no integers.");
        }

        input.close();

    } catch (FileNotFoundException e) {
        System.out.println("Sorry, scores.txt was not found.");
    }
}

}