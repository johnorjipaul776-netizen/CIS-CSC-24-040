package Lab7;

public class Palindrome {
    

    // Check whether a number is a palindrome
    public static boolean isPalindrome(int n) {

        int original = n;
        int reversed = 0;

        while (n > 0) {

            int digit = n % 10;

            reversed = reversed * 10 + digit;

            n = n / 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {

        System.out.println("TASK 7.7: PALINDROME NUMBERS");

        System.out.println("Palindromic numbers from 100 to 999:");

        for (int i = 100; i <= 999; i++) {

            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}
