package constructs; // Package declaration

import java.util.Scanner; // Import the Scanner class for user input

public class PrimeChecker { // Public class declaration

    // Method to check if a given number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) { // Check if the number is less than or equal to 1
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i * i <= number; i++) { // Iterate from 2 to the square root of the number
            if (number % i == 0) { // If the number is divisible by i without remainder
                return false; // It is not a prime number
            }
        }
        return true; // If no divisors were found, the number is prime
    }
    
    // Main method to execute the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the user
        
        // Prompt the user to enter a number to check if it is prime
        System.out.print("Enter a number to check if it is prime: ");
        int number = sc.nextInt(); // Read the integer input from the user
        
        // Check if the entered number is prime and print the result
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
