import java.util.Scanner;

public class EmailCheck {

    public static boolean isValidEmail(String email) {

        // Check for spaces
        if (email.contains(" ")) {
            return false;
        }

        // Find the position of @
        int atPosition = email.indexOf('@');

        // Check that @ exists and is not the first character
        if (atPosition <= 0) {
            return false;
        }

        // Check that there is exactly one @
        if (email.indexOf('@') != email.lastIndexOf('@')) {
            return false;
        }

        // Check that a dot exists after @
        int dotPosition = email.indexOf('.', atPosition);

        if (dotPosition <= atPosition + 1) {
            return false;
        }

        // Check that the dot is not the last character
        if (dotPosition == email.length() - 1) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your email address: ");
        String email = input.nextLine();

        if (isValidEmail(email)) {
            System.out.println("Valid email address.");
        } else {
            System.out.println("Invalid email address.");
        }

        input.close();
    }
}