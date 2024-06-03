package constructs;
import java.util.Scanner;

public class PalindromeChecker {
	public static boolean isPalindrome(String str) {

        str = str.replaceAll("\\s+", "").toLowerCase();
        String reversedStr = new StringBuilder(str).reverse().toString();
        
        // Check if the original string is equal to the reversed string
        return str.equals(reversedStr);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome:");
        String inputString = sc.nextLine();
        if (isPalindrome(inputString))
        {
            System.out.println("\"" + inputString + "\" is a palindrome.");
        } 
        else 
        {
            System.out.println("\"" + inputString + "\" is not a palindrome.");
        }

	}

}
