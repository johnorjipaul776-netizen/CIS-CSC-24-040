
package Lab4;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

    System.out.print("Enter first side: ");
    double a = input.nextDouble();

    System.out.print("Enter second side: ");
    double b = input.nextDouble();

    System.out.print("Enter third side: ");
    double c = input.nextDouble();

    if (a <= 0 || b <= 0 || c <= 0) {
        System.out.println("Invalid side lengths.");
    } else if (a < b + c && b < a + c && c < a + b) {

        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } else if (a == b || a == c || b == c) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }

    } else {
        System.out.println("The sides cannot form a triangle.");
    }

    input.close();
}
}
