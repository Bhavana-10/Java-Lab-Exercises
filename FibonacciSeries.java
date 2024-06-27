package constructs; // Package declaration

import java.util.Scanner; // Import the Scanner class for user input

public class FibonacciSeries { // Public class declaration

    // Method to generate and print the Fibonacci series up to the given number of terms
    public static void generateFibonacci(int terms) {
        int firstTerm = 0; // Initialize the first term of the Fibonacci series
        int secondTerm = 1; // Initialize the second term of the Fibonacci series

        System.out.print("Fibonacci Series: "); // Print label for the series
        
        // Loop to generate the Fibonacci series
        for (int i = 1; i <= terms; i++) {
            System.out.print(firstTerm + " "); // Print the current term
            
            // Compute the next term by adding the previous two terms
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm; // Update first term to be the previous second term
            secondTerm = nextTerm; // Update second term to be the newly computed next term
        }
        System.out.println(); // Print a newline for better formatting
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of terms for the Fibonacci series
        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt(); // Read the number of terms from the user

        // Call the generateFibonacci method to print the Fibonacci series
        generateFibonacci(terms);
    }
}
