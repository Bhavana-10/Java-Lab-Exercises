package functions; // Package declaration

import java.util.*; // Importing the java.util package for Scanner class

public class LargestNumber {

    // Method to find the largest number among three integers
    public static int findLargestNumber(int a, int b, int c) {
        if (a >= b && a >= c) { // Check if 'a' is greater than or equal to 'b' and 'c'
            return a; // Return 'a' if it is the largest
        } else if (b >= a && b >= c) { // Check if 'b' is greater than or equal to 'a' and 'c'
            return b; // Return 'b' if it is the largest
        } else {
            return c; // If neither 'a' nor 'b' is the largest, return 'c'
        }
    }

    // Main method - entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for user input
        
        // Prompting the user to enter the first number
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt(); // Reading the first integer input
        
        // Prompting the user to enter the second number
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt(); // Reading the second integer input
        
        // Prompting the user to enter the third number
        System.out.println("Enter the third number:");
        int num3 = sc.nextInt(); // Reading the third integer input
        
        int largest = findLargestNumber(num1, num2, num3); // Calling the findLargestNumber method to find the largest number
        
        // Displaying the result to the user
        System.out.println("The largest number among " + num1 + ", " + num2 + ", and " + num3 + " is " + largest + ".");
        
    }

}
