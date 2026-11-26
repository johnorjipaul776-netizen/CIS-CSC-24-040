
package Lab4;
import java.util.Scanner;
public class PassFail {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

    System.out.print("Enter your score: ");
    int score = input.nextInt();

    if (score >= 40) {
        System.out.println("Pass");
    } else {
        System.out.println("Fail");
    }

    input.close();
}
}
