
package Lab4;
import java.util.Scanner;
public class LoginSystem {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

    String correctUsername = "johnix";
    String correctPassword = "java123";

    System.out.print("Enter username: ");
    String username = input.nextLine();

    System.out.print("Enter password: ");
    String password = input.nextLine();

    if (username.equals(correctUsername) &&
        password.equals(correctPassword)) {

        System.out.println("Access granted");

    } else {
        System.out.println("Access denied");
    }

    input.close();
}
}
