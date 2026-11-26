import java.util.Scanner;

public class LetterFrequency {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] frequency = new int[26];

        System.out.println("Enter a paragraph:");
        String paragraph = input.nextLine();

        // Count the letters
        for (int i = 0; i < paragraph.length(); i++) {

            char ch = Character.toLowerCase(paragraph.charAt(i));

            if (ch >= 'a' && ch <= 'z') {

                frequency[ch - 'a']++;
            }
        }

        // Display the frequency table
        System.out.println("\nLETTER FREQUENCY TABLE");

        System.out.println("----------------------");

        for (int i = 0; i < 26; i++) {

            char letter = (char) ('a' + i);

            System.out.println(letter + " : " + frequency[i]);
        }

        input.close();
    }
}