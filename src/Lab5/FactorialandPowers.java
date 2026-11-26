
package Lab5;
import java.util.Scanner;
public class FactorialandPowers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        if (n < 0 || n > 20) {
            System.out.println("Enter a number between 0 and 20.");
        } else {

            long factorial = 1;

            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            long power = 1;

            for (int i = 1; i <= n; i++) {
                power *= 2;
            }

            System.out.println(n + "! = " + factorial);
            System.out.println("2 to the power " + n + " = " + power);
        }

        input.close();
    }
}
