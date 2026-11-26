package Lab6;

public class Student {

    private String name;
    private String matricNumber;
    private double score;

    // Static counter
    private static int studentCount = 0;

    // Constructor
    public Student(String name, String matricNumber, double score) {

        this.name = name;
        this.matricNumber = matricNumber;
        this.score = score;

        studentCount++;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getMatricNumber() {
        return matricNumber;
    }

    public double getScore() {
        return score;
    }

    // toString method
    @Override
    public String toString() {
        return "Name: " + name
                + ", Matric Number: " + matricNumber
                + ", Score: " + score;
    }

    // Get total number of students
    public static int getStudentcounter() {
        return studentCount;
    }
}

