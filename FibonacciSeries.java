package constructs;
import java.util.Scanner;

public class FibonacciSeries {

	public static void generateFibonacci(int terms) {
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci Series: ");
        
        for (int i = 1; i <= terms; i++) {
            System.out.print(firstTerm + " ");
            
            // Compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println(); 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();

        generateFibonacci(terms);
	}

}
