package array;
import java.util.*;

// Class to remove duplicates from an array of integers
public class RemoveDuplicates {

    // Main method to execute the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt(); // Read the number of elements entered by the user
        
        // Set to store unique elements (removes duplicates automatically)
        Set<Integer> uniqueElements = new HashSet<>();
        
        // Prompt user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt(); // Read each element from user input
            uniqueElements.add(num); // Add each element to the HashSet (duplicates are automatically removed)
        }
        
        // Output the array after removing duplicates
        System.out.print("Array after removing duplicates: ");
        for (int num : uniqueElements) {
            System.out.print(num + " "); // Print each unique element
        }
    }

}
