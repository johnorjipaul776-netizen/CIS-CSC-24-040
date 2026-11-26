package Lab8;

import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] marks = new int[5][4];

        String[] students = {
            "Student 1",
            "Student 2",
            "Student 3",
            "Student 4",
            "Student 5"
        };

        String[] courses = {
            "Course 1",
            "Course 2",
            "Course 3",
            "Course 4"
        };

        System.out.println("TASK 8.8: STUDENT MARKS");

        // Enter marks for five students in four courses
        for (int i = 0; i < 5; i++) {

            System.out.println("\nEnter marks for " + students[i]);

            for (int j = 0; j < 4; j++) {

                System.out.print(courses[j] + ": ");

                marks[i][j] = input.nextInt();
            }
        }

        // Calculate each student's total and average
        System.out.println("\nSTUDENT RESULTS");

        for (int i = 0; i < 5; i++) {

            int total = 0;

            for (int j = 0; j < 4; j++) {

                total += marks[i][j];
            }

            double average = total / 4.0;

            System.out.println(students[i]
                    + " - Total: " + total
                    + ", Average: " + average);
        }

        // Calculate each course's average
        System.out.println("\nCOURSE AVERAGES");

        for (int j = 0; j < 4; j++) {

            int total = 0;

            for (int i = 0; i < 5; i++) {

                total += marks[i][j];
            }

            double average = total / 5.0;

            System.out.println(courses[j]
                    + " Average: " + average);
        }
    }
}