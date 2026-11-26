
package Lab4;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

    System.out.print("Enter year: ");
    int year = input.nextInt();

    System.out.print("Enter month number (1-12): ");
    int month = input.nextInt();

    if (year <= 0) {
        System.out.println("Invalid year.");
    } else if (month < 1 || month > 12) {
        System.out.println("Invalid month number.");
    } else {

        int days;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;

            case 2:
                if (year % 400 == 0 ||
                   (year % 4 == 0 && year % 100 != 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;

            default:
                days = 0;
        }

        System.out.println("Number of days: " + days);
    }

    input.close();
}
}
