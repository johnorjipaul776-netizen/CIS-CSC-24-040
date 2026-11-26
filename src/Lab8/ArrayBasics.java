package Lab8;

import java.util.Scanner;

public class ArrayBasics {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        int sum = 0;
        int maximum;
        int minimum;
        int aboveAverage = 0;

        System.out.println("TASK 8.1: ARRAY BASICS");

        // Enter ten integers
        for (int i = 0; i < numbers.length; i++) {

            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();

            sum += numbers[i];
        }

        // Calculate average
        double average = (double) sum / numbers.length;

        // Assume the first element is maximum and minimum
        maximum = numbers[0];
        minimum = numbers[0];

        // Find maximum and minimum
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }

            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }

            if (numbers[i] > average) {
                aboveAverage++;
            }
        }

        // Display results
        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
        System.out.println("Values above average: " + aboveAverage);
    }
}