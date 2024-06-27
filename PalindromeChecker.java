package constructs; // Package declaration

import java.util.Scanner; // Import the Scanner class for user input

public class PalindromeChecker {
    // Method to check if the given string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove all whitespace and convert the string to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();
        
        // Reverse the cleaned string
        String reversedStr = new StringBuilder(str).reverse().toString();
        
        // Check if the original string is equal to the reversed string
        return str.equals(reversedStr);
    }

    // Main method to test the isPalindrome method
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string to check if it is a palindrome
        System.out.println("Enter a string to check if it is a palindrome:");
        String inputString = sc.nextLine();

        // Check if the input string is a palindrome and print the result
        if (isPalindrome(inputString)) {
            // Print if the input string is a palindrome
            System.out.println("\"" + inputString + "\" is a palindrome.");
        } else {
            // Print if the input string is not a palindrome
            System.out.println("\"" + inputString + "\" is not a palindrome.");
        }
        
        // Close the scanner to avoid resource leak
        sc.close();
    }
}
