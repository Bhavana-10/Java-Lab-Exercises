package collections;
import java.util.*;
public class WordCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = sc.nextLine();
        System.out.println("Enter the word to count:");
        String wordToCount = sc.nextLine(); 
        String[] words = inputString.split("\\s+");
        int count = 0;
        for (String word : words) {
            if (word.equals(wordToCount)) {
                count++;
            }
        }
        System.out.println("The word \"" + wordToCount + "\" occurs " + count + " times in the string.");
	}
}
