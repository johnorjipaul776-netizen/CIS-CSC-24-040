package Lab7;

public class Passvalue {

    // Method to swap two numbers
    public static void swap(int a, int b) {

        int temp = a;

        a = b;

        b = temp;

        System.out.println("Inside swap method:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {

        System.out.println("TASK 7.4: PASS BY VALUE");

        int x = 10;
        int y = 20;

        System.out.println("Before calling swap:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        swap(x, y);

        System.out.println("After calling swap:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}