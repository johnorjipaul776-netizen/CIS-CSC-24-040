package Conversion;

public class Overflow {
    public static void main(String[] args) {
        int result = Integer.MAX_VALUE + 1;

        long longResult = (long) Integer.MAX_VALUE + 1;

        System.out.println("Integer Maximum Value: " + Integer.MAX_VALUE);
        System.out.println("Integer Overflow Result: " + result);
        System.out.println("Long Result: " + longResult);
    }
}