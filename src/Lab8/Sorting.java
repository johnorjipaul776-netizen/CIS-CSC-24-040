package Lab8;

import java.util.Arrays;

public class Sorting {

    // Bubble Sort
    public static void bubbleSort(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {

            for (int j = 0; j < numbers.length - 1 - i; j++) {

                if (numbers[j] > numbers[j + 1]) {

                    int temp = numbers[j];

                    numbers[j] = numbers[j + 1];

                    numbers[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    public static void selectionSort(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[j] < numbers[minIndex]) {

                    minIndex = j;
                }
            }

            int temp = numbers[i];

            numbers[i] = numbers[minIndex];

            numbers[minIndex] = temp;
        }
    }

    // Test sorting methods
    public static void testSorting(String name, int[] original) {

        int[] bubble = Arrays.copyOf(original, original.length);

        int[] selection = Arrays.copyOf(original, original.length);

        int[] builtIn = Arrays.copyOf(original, original.length);

        bubbleSort(bubble);

        selectionSort(selection);

        Arrays.sort(builtIn);

        System.out.println("\n" + name);

        System.out.println("Original: "
                + Arrays.toString(original));

        System.out.println("Bubble Sort: "
                + Arrays.toString(bubble));

        System.out.println("Selection Sort: "
                + Arrays.toString(selection));

        System.out.println("Arrays.sort: "
                + Arrays.toString(builtIn));
    }

    public static void main(String[] args) {

        System.out.println("TASK 8.4: SORTING ALGORITHMS");

        int[] sorted = {1, 2, 3, 4, 5};

        int[] reversed = {5, 4, 3, 2, 1};

        int[] random = {8, 3, 9, 1, 6};

        testSorting("SORTED DATA", sorted);

        testSorting("REVERSED DATA", reversed);

        testSorting("RANDOM DATA", random);
    }
}