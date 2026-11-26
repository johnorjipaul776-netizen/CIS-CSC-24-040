package Lab8;

import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        System.out.println("TASK 8.7: MATRIX OPERATIONS");

        // Enter matrix values
        System.out.println("Enter the values of the 3 x 3 matrix:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("Enter value [" + i + "][" + j + "]: ");

                matrix[i][j] = input.nextInt();
            }
        }

        // Display matrix
        System.out.println("\nThe Matrix:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(matrix[i][j] + "\t");
            }

            System.out.println();
        }

        // Calculate row sums
        System.out.println("\nSum of Each Row:");

        for (int i = 0; i < 3; i++) {

            int rowSum = 0;

            for (int j = 0; j < 3; j++) {

                rowSum += matrix[i][j];
            }

            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }

        // Calculate column sums
        System.out.println("\nSum of Each Column:");

        for (int j = 0; j < 3; j++) {

            int columnSum = 0;

            for (int i = 0; i < 3; i++) {

                columnSum += matrix[i][j];
            }

            System.out.println("Column " + (j + 1) + ": " + columnSum);
        }

        // Calculate main diagonal sum
        int diagonalSum = 0;

        for (int i = 0; i < 3; i++) {

            diagonalSum += matrix[i][i];
        }

        System.out.println("\nMain Diagonal Sum: " + diagonalSum);
    }
}