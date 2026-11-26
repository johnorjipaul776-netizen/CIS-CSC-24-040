package Lab3;

import java.util.Scanner;

public class Greeting {
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();
        
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();
        
        System.out.println("Welcome, " + lastName + ", " + firstName);
    }
}

}