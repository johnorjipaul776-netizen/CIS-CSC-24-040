package Lab7;

public class Lab7Test {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {

        System.out.println("TEMPERATURE CONVERSION TABLE");

        System.out.println("Celsius\tFahrenheit");

        // Print temperatures from 0 to 100
        for (int c = 0; c <= 100; c += 10) {

            double f = celsiusToFahrenheit(c);

            System.out.printf("%d\t%.2f%n", c, f);
        }

        // Convert 100 Fahrenheit to Celsius
        System.out.println("\n100 Fahrenheit in Celsius: "
                + fahrenheitToCelsius(100));
    }
}