package Lab8;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    static int comparisons = 0;

    // Binary Search method
    public static int binarySearch(int[] numbers, int target) {

        int left = 0;

        int right = numbers.length - 1;

        comparisons = 0;

        while (left <= right) {

            int middle = left + (right - left) / 2;

            comparisons++;

            if (numbers[middle] == target) {

                return middle;
            }

            if (numbers[middle] < target) {

                left = middle + 1;

            } else {

                right = middle - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = {45, 12, 78, 23, 56, 89, 34};

        System.out.println("TASK 8.5: BINARY SEARCH");

        // Sort the array first
        Arrays.sort(numbers);

        System.out.println("Sorted array: "
                + Arrays.toString(numbers));

        System.out.print("Enter number to search: ");

        int target = input.nextInt();

        int result = binarySearch(numbers, target);

        if (result != -1) {

            System.out.println("Number found at position: "
                    + (result + 1));

        } else {

            System.out.println("Number not found.");
        }

        System.out.println("Number of comparisons: "
                + comparisons);
    }
}