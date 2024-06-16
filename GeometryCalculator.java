package functions;
import java.util.*;
public class GeometryCalculator {

	public static double calculateArea(double side) {
        return side * side;
    }

    // Method to calculate the area of a rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }
    // Method to calculate the area of a circle
    public static double calculateArea(double radius, boolean isCircle) {
        if (isCircle) {
            return Math.PI * radius * radius;
        } else {
            
            return 0;
        }
    }

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.println("Choose the shape to calculate the area:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the side length of the square: ");
                double side = sc.nextDouble();
                System.out.println("Area of square: " + calculateArea(side));
                break;

            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = sc.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = sc.nextDouble();
                System.out.println("Area of rectangle: " + calculateArea(length, width));
                break;

            case 3:
                System.out.print("Enter the radius of the circle: ");
                double radius = sc.nextDouble();
                System.out.println("Area of circle: " + calculateArea(radius, true));
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }
	}

}
