package constructor;
import java.util.*;

//Class to determine voter eligibility based on birth year
public class VoterEligibility {

	// Constructor to calculate age and determine eligibility
	VoterEligibility(int birthYear) {
		// Get current year
		int currentYear = java.time.Year.now().getValue();
		// Calculate age
		int age = currentYear - birthYear;
     
		// Output age
		System.out.println("You are " + age + " years old.");
     
		// Check eligibility
		if (age >= 18) {
			System.out.println("You are eligible to vote.");
		} else {
			System.out.println("You are not eligible to vote.");
		}
	}
	
	// Main method to execute the program
	public static void main(String[] args) {
		// Scanner to read input
		Scanner sc = new Scanner(System.in);
     
		// Prompt user for birth year
		System.out.println("Enter your birth year:");
		int birthYear = sc.nextInt();
     
		// Create instance of VoterEligibility to check eligibility
		VoterEligibility ve = new VoterEligibility(birthYear);
	}
}

