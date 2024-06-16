package functions;
import java.util.*;

public class LargestNumber {
	public static int findLargestNumber(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number:");
        int num3 = sc.nextInt();      
        int largest = findLargestNumber(num1, num2, num3);
        System.out.println("The largest number among " + num1 + ", " + num2 + ", and " + num3 + " is " + largest + ".");
	}

}
