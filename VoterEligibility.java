package functions;
import java.util.*;
public class VoterEligibility {

	VoterEligibility(int birthYear) {
        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - birthYear;
        
        System.out.println("You are " + age + " years old.");
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birth year:");
        int birthYear = sc.nextInt();
        VoterEligibility ve = new VoterEligibility(birthYear);
        
	}

}
