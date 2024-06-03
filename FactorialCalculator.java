package constructs;
import java.util.Scanner;

public class FactorialCalculator {

	public static long factorialIterative(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    // Method to calculate factorial using recursive approach
    public static long factorialRecursive(int number) {
        if (number == 0) {
            return 1;
        } 
        else {
            return number * factorialRecursive(number - 1);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int number = sc.nextInt();
        System.out.println("Factorial (Iterative): " + factorialIterative(number));
        System.out.println("Factorial (Recursive): " + factorialRecursive(number));

	}

}
