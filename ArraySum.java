package array;
import java.util.*;

// Class to calculate the sum of elements in an array
public class ArraySum {

    // Main method to execute the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        // Create an array to store the elements
        int[] numbers = new int[n];
        int sum = 0;
        
        // Prompt user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt(); // Read each element and store it in the array
            sum += numbers[i]; // Add each element to calculate the sum
        }
        
        // Output the sum of all elements in the array
        System.out.println("Sum of all elements in the array is: " + sum);
    }
}
