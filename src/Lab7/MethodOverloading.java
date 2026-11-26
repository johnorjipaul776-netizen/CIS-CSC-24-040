package Lab7;

public class MethodOverloading {

    // Area of a square
    public static int area(int side) {
        return side * side;
    }

    // Area of a rectangle
    public static int area(int length, int width) {
        return length * width;
    }

    // Area of a circle
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        System.out.println("TASK 7.3: METHOD OVERLOADING");

        System.out.println("Area of square: " + area(5));

        System.out.println("Area of rectangle: " + area(5, 8));

        System.out.printf("Area of circle: %.2f%n", area(7.0));
    }
}