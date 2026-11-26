
package Lab5;
import java.util.Scanner;
public class SumandAverage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mark;
        int count = 0;
        int sum = 0;
        int highest = 0;
        int lowest = 0;

        System.out.println("Enter marks (-1 to stop):");

        while (true) {

            mark = input.nextInt();

            if (mark == -1) {
                break;
            }

            if (count == 0) {
                highest = mark;
                lowest = mark;
            } else {
                if (mark > highest) {
                    highest = mark;
                }

                if (mark < lowest) {
                    lowest = mark;
                }
            }

            sum += mark;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;

            System.out.println("Count: " + count);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
            System.out.println("Highest: " + highest);
            System.out.println("Lowest: " + lowest);
        } else {
            System.out.println("No marks were entered.");
        }

        input.close();
    }
}
