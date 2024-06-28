package functions; // Package declaration

import java.util.*; // Importing the java.util package for Scanner class

public class ArithmeticOperations {

    // Method to perform arithmetic operations based on operation type
    public static double performOperation(double a, double b, String operation) {
        switch (operation) {
            case "add":
                return a + b; // Addition operation
            case "subtract":
                return a - b; // Subtraction operation
            case "multiply":
                return a * b; // Multiplication operation
            case "divide":
                if (b != 0) {
                    return a / b; // Division operation (checks for division by zero)
                } else {
                    System.out.println("Error! Division by zero."); // Error message for division by zero
                    return Double.NaN; // Return NaN (Not-a-Number) to indicate error
                }
            default:
                System.out.println("Invalid operation. Please choose 'add', 'subtract', 'multiply', or 'divide'.");
                return Double.NaN; // Return NaN for invalid operations
        }
    }

    // Main method - entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for user input
        
        // Prompting the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble(); // Reading the first double input
        
        // Prompting the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble(); // Reading the second double input
        
        // Prompting the user to enter the operation type
        System.out.print("Enter the operation (add, subtract, multiply, divide): ");
        String operation = sc.next(); // Reading the operation type as a string
        
        double result = performOperation(num1, num2, operation); // Calling performOperation method to perform the requested operation
        
        if (!Double.isNaN(result)) { // Checking if result is not NaN (indicating valid operation)
            System.out.println("The result of the operation is: " + result); // Displaying the result to the user
        }
    }

}
