package collections;
import java.util.HashMap;
//import java.util.Map;
import java.util.*;
public class CricketerScores {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> cricketerScores = new HashMap<>();
        cricketerScores.put("Virat Kohli", 12000);
        cricketerScores.put("Sachin Tendulkar", 18426);
        cricketerScores.put("Ricky Ponting", 13704);
        cricketerScores.put("Jacques Kallis", 11579);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cricketer's name to search for his score:");
        String cricketerName = sc.nextLine();
        if (cricketerScores.containsKey(cricketerName)) {
            int score = cricketerScores.get(cricketerName);
            System.out.println(cricketerName + " has scored " + score + " runs.");
        } else {
            System.out.println("Cricketer not found in the records.");
        }
	}
}
