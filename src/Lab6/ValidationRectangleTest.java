package Lab6;

public class ValidationRectangleTest {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 5);

        System.out.println(rectangle.area() + "Original Area: ");

        // Valid values
        rectangle.setLength(15);
        rectangle.setWidth(8);

        System.out.println("New Area: " + rectangle.area());

        // Invalid values
        rectangle.setLength(-5);
        rectangle.setWidth(-10);

        System.out.println("Final Length: " + rectangle.getLength());
        System.out.println("Final Width: " + rectangle.getWidth());
    }
}