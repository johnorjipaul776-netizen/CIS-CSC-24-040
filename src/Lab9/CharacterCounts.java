import java.util.Scanner;

public class CharacterCounts {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;

        System.out.print("Enter a line of text: ");
        String text = input.nextLine();

        for (int i = 0; i < text.length(); i++) {

            char ch = Character.toLowerCase(text.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {

                vowels++;

            } else if (ch >= 'a' && ch <= 'z') {

                consonants++;

            } else if (Character.isDigit(ch)) {

                digits++;

            } else if (ch == ' ') {

                spaces++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);

        input.close();
    }
}