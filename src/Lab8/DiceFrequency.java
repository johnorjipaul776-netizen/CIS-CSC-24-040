package Lab8;

import java.util.Random;

public class DiceFrequency {

    public static void main(String[] args) {

        Random random = new Random();

        int[] frequency = new int[7];

        System.out.println("TASK 8.6: DICE FREQUENCY");

        // Generate 60 random dice throws
        for (int i = 0; i < 60; i++) {

            int dice = random.nextInt(6) + 1;

            frequency[dice]++;
        }

        // Display frequency of each face
        System.out.println("\nDice Results:");

        for (int i = 1; i <= 6; i++) {

            System.out.println("Face " + i + ": "
                    + frequency[i] + " times");
        }
    }
}