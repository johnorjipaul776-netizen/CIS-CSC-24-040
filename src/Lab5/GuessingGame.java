
package Lab5;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int secretNumber = (int) (Math.random() * 100) + 1;

        int guess;
        int attempts = 0;

        System.out.println("Guess a number between 1 and 100.");

        do {

            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            attempts++;

            if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Correct! You guessed the number.");
                System.out.println("Number of attempts: " + attempts);
            }

        } while (guess != secretNumber);

        input.close();
    }
}
