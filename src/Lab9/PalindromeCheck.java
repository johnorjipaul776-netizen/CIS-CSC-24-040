public class PalindromeCheck {

    public static boolean isPalindrome(String text) {

        String cleaned = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                cleaned += Character.toLowerCase(ch);
            }
        }

        String reversed = "";

        for (int i = cleaned.length() - 1; i >= 0; i--) {

            reversed += cleaned.charAt(i);
        }

        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {

        String sentence = "A man, a plan, a canal: Panama";

        System.out.println("Sentence: " + sentence);

        if (isPalindrome(sentence)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }
}