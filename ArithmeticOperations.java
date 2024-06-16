package functions;
import java.util.*;
public class ArithmeticOperations {
	public static double performOperation(double a, double b, String operation) {
        switch (operation) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Error! Division by zero.");
                    return Double.NaN; 
                }
            default:
                System.out.println("Invalid operation. Please choose 'add', 'subtract', 'multiply', or 'divide'.");
                return Double.NaN;
        }
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter the operation (add, subtract, multiply, divide): ");
        String operation = sc.next();
        double result = performOperation(num1, num2, operation);
        if (!Double.isNaN(result)) {
            System.out.println("The result of the operation is: " + result);
        }
	}

}
