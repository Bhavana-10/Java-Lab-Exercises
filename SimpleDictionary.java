package collections;
import java.util.*;
import java.util.TreeMap;

public class SimpleDictionary {
    public static void main(String[] args) {
        TreeMap<String, String> dictionary = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nDictionary Application Menu:");
            System.out.println("1. Add a word-definition pair");
            System.out.println("2. Retrieve definition of a word");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter the word: ");
                    String word = scanner.nextLine();
                    System.out.print("Enter the definition: ");
                    String definition = scanner.nextLine();
                    dictionary.put(word, definition);
                    System.out.println("Word-definition pair added successfully.");
                    break;
                case 2:
                    System.out.print("Enter the word to retrieve its definition: ");
                    String searchWord = scanner.nextLine();
                    String result = dictionary.get(searchWord);
                    if (result != null) {
                        System.out.println("Definition of \"" + searchWord + "\": " + result);
                    } else {
                        System.out.println("Word not found in the dictionary.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting the Dictionary Application. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }
    }
}

