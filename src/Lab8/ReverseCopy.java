package Lab8;

public class ReverseCopy {

    public static void main(String[] args) {

        System.out.println("TASK 8.2: REVERSE AND COPY");

        int[] numbers = {10, 20, 30, 40, 50};

        // Print original array
        System.out.println("Original array:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Print array in reverse order
        System.out.println("\n\nArray in reverse order:");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        // Create reversed copy
        int[] reversed = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {

            reversed[i] = numbers[numbers.length - 1 - i];
        }

        // Display reversed copy
        System.out.println("\n\nReversed copy:");

        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i] + " ");
        }

        // Display original array again
        System.out.println("\n\nOriginal array remains unchanged:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}