package Lab7;

public class MathUtil {
    
    

    // Task 7.1: Calculate cube of a number
    public static int cube(int number) {
        return number * number * number;
    }

    // Check if a number is odd
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    // Find the largest of three numbers
    public static int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {

        System.out.println("TASK 7.1: SIMPLE METHODS");

        System.out.println("Cube of 3: " + cube(3));

        System.out.println("Is 7 odd? " + isOdd(7));

        System.out.println("Largest number: " + maxOfThree(12, 25, 18));
    }

    static boolean isPrime(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static boolean factorial(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static boolean gcd(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static boolean power(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
