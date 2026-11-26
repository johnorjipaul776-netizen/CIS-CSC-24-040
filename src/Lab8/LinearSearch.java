package Lab8;

import java.util.Scanner;

public class LinearSearch {

    // Method to search for a number
    public static int indexOf(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = {12, 25, 34, 45, 56, 67, 78, 89};

        System.out.println("TASK 8.3: LINEAR SEARCH");

        System.out.print("Enter the number to search for: ");

        int target = input.nextInt();

        int position = indexOf(numbers, target);

        if (position != -1) {

            System.out.println("Number found at position: "
                    + (position + 1));

        } else {

            System.out.println("Number not found.");
        }
    }
}