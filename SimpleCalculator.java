package constructs;
import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        //System.out.println("Welcome to Simple Calculator!");
        System.out.println("Enter the operation you want to perform:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        // Read the operation choice
        char operation = sc.next().charAt(0);

        // Read the operands
        System.out.println("Enter first operand:");
        double operand1 = sc.nextDouble();
        System.out.println("Enter second operand:");
        double operand2 = sc.nextDouble();

        // Perform the operation and display the result
        double result;
        switch (operation) {
            case '+':
                result = operand1 + operand2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = operand1 - operand2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = operand1 * operand2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (operand2 != 0) {
                    result = operand1 / operand2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Error: Invalid operation!");
        }

        sc.close();
	}

}
