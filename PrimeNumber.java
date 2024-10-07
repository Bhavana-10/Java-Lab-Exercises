package loops;

import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter the first number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int end = scanner.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ":");

        // Loop through the range and print prime numbers
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        scanner.close();;
    }

    // Simple prime check method
    public static boolean isPrime(int num) {
        if (num <= 1) return false; // Numbers less than or equal to 1 are not prime
        for (int i = 2; i <= num / 2; i++) { // Only check up to half the number
            if (num % i == 0) {
                return false; // If divisible by any number, it's not prime
            }
        }
        return true; // Otherwise, it's prime
    }

}
