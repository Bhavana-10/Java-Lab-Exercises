package constructs;
import java.util.Scanner;
public class PrimeChecker {

	public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int number = sc.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } 
        else {
            System.out.println(number + " is not a prime number.");
        }
	}
}