
package Lab6;

public class ClassList {
    

    public static void main(String[] args) {

        Student[] students = {

            new Student("John", "CSC/001", 85),
            new Student("David", "CSC/002", 75),
            new Student("Mary", "CSC/003", 90),
            new Student("Paul", "CSC/004", 68),
            new Student("James", "CSC/005", 80),
            new Student("Grace", "CSC/006", 95),
            new Student("Peter", "CSC/007", 72),
            new Student("Sarah", "CSC/008", 88),
            new Student("Michael", "CSC/009", 60),
            new Student("Daniel", "CSC/010", 78)
        };

        double total = 0;

        Student highestStudent = students[0];

        for (int i = 0; i < students.length; i++) {

            total += students[i].getScore();

            if (students[i].getScore() > highestStudent.getScore()) {
                highestStudent = students[i];
            }
        }

        double average = total / students.length;

        System.out.println("Student with Highest Score:");
        System.out.println(highestStudent);

        System.out.println("\nClass Average: " + average);
    }
}
