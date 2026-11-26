
package Lab5;

public class FibonacciArmstrong {
    public static void main(String[] args) {

        // First 20 Fibonacci numbers

        int first = 0;
        int second = 1;

        System.out.println("First 20 Fibonacci numbers:");

        for (int i = 1; i <= 20; i++) {

            System.out.print(first + " ");

            int next = first + second;

            first = second;
            second = next;
        }

        System.out.println("\n");
        
        // Armstrong numbers between 100 and 999

        System.out.println("Armstrong numbers between 100 and 999:");

        for (int number = 100; number <= 999; number++) {

            int original = number;
            int sum = 0;

            while (original > 0) {

                int digit = original % 10;

                sum += digit * digit * digit;

                original /= 10;
            }

            if (sum == number) {
                System.out.print(number + " ");
            }
        }
    }
}
