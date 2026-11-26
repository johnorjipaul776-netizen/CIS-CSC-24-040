
package Lab7;

public class Recursion {
    // Find the sum of the first n integers
    public static int sum(int n) {

        if (n <= 0) {
            return 0;
        }

        return n + sum(n - 1);
    }

    // Calculate power using recursion
    public static int recursivePower(int base, int exponent) {

        if (exponent == 0) {
            return 1;
        }

        return base * recursivePower(base, exponent - 1);
    }

    // Reverse a string using recursion
    public static String reverse(String text) {

        if (text.isEmpty()) {
            return text;
        }

        return reverse(text.substring(1)) + text.charAt(0);
    }

    public static void main(String[] args) {

        System.out.println("TASK 7.6: RECURSION");

        // Testing sum
        System.out.println("Sum of first 5 integers: " + sum(5));

        // Testing recursive power
        System.out.println("2 raised to power 4: "
                + recursivePower(2, 4));

        // Testing string reversal
        System.out.println("Reverse of COMPUTER: "
                + reverse("COMPUTER"));
    }
}

