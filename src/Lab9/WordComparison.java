import java.util.Scanner;

public class WordComparison {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String word1 = input.nextLine();

        System.out.print("Enter the second word: ");
        String word2 = input.nextLine();

        System.out.println("Are they exactly equal? "
                + word1.equals(word2));

        System.out.println("Are they equal ignoring case? "
                + word1.equalsIgnoreCase(word2));

        int result = word1.compareToIgnoreCase(word2);

        if (result < 0) {
            System.out.println(word1 + " comes first alphabetically.");
        } else if (result > 0) {
            System.out.println(word2 + " comes first alphabetically.");
        } else {
            System.out.println("Both words are alphabetically equal.");
        }

        input.close();
    }
}