package Lab6;
public class StudentTest {
    

    public static void main(String[] args) {

        Student student1 = new Student("John", "CSC/001", 85);
        Student student2 = new Student("David", "CSC/002", 75);
        Student student3 = new Student("Mary", "CSC/003", 90);
        Student student4 = new Student("Paul", "CSC/004", 68);
        Student student5 = new Student("James", "CSC/005", 80);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
    }
}
