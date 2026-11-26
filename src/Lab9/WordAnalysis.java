import java.util.Scanner;

public class WordAnalysis {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine().trim();

        if (sentence.isEmpty()) {

            System.out.println("Number of words: 0");
            System.out.println("There is no longest word.");

        } else {

            String[] words = sentence.split("\\s+");

            String longest = words[0];

            System.out.println("Words in the sentence:");

            for (String word : words) {

                System.out.println(word);

                if (word.length() > longest.length()) {
                    longest = word;
                }
            }

            System.out.println("Number of words: " + words.length);

            System.out.println("Longest word: " + longest);
        }

        input.close();
    }
}