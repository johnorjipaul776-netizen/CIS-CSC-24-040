
package Lab5;

public class Patterns {
    public static void main(String[] args) {

        // Right triangle
        System.out.println("Right Triangle:");

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Inverted triangle
        System.out.println("\nInverted Triangle:");

        for (int i = 4; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Number pyramid
        System.out.println("\nNumber Pyramid:");

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
