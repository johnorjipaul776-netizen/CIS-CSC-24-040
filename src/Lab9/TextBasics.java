import java.util.Scanner;

public class TextBasics {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        System.out.println("Length: " + sentence.length());

        if (!sentence.isEmpty()) {
            System.out.println("First character: " + sentence.charAt(0));

            System.out.println("Last character: "
                    + sentence.charAt(sentence.length() - 1));
        }

        System.out.println("Uppercase: " + sentence.toUpperCase());

        System.out.println("Lowercase: " + sentence.toLowerCase());

        input.close();
    }
}