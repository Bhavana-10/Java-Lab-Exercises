package constructs; // Package declaration

import java.util.Scanner; // Import the Scanner class for user input

public class FactorialCalculator { // Public class declaration

    // Method to calculate factorial using iterative approach
    public static long factorialIterative(int number) {
        long result = 1; // Initialize the result to 1
        for (int i = 1; i <= number; i++) { // Loop from 1 to the given number
            result *= i; // Multiply result by the current value of i
        }
        return result; // Return the final factorial result
    }

    // Method to calculate factorial using recursive approach
    public static long factorialRecursive(int number) {
        if (number == 0) { // Base case: if number is 0, return 1
            return 1;
        } else { // Recursive case: multiply the number by the factorial of (number - 1)
            return number * factorialRecursive(number - 1);
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the user

        // Prompt the user to enter a number to calculate its factorial
        System.out.print("Enter a number to calculate its factorial: ");
        int number = sc.nextInt(); // Read the integer input from the user

        // Calculate and print the factorial using the iterative method
        System.out.println("Factorial (Iterative): " + factorialIterative(number));

        // Calculate and print the factorial using the recursive method
        System.out.println("Factorial (Recursive): " + factorialRecursive(number));
    }
}
