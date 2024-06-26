package collections;
import java.util.HashMap;
import java.util.*;
public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "One");
        hashMap.put("2", "Two");
        hashMap.put("3", "Three");
        System.out.println("Initial HashMap: " + hashMap);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a key:");
        String key = sc.nextLine();
        System.out.println("Enter a value:");
        String value = sc.nextLine();
        hashMap.put(key, value);
        System.out.println("Updated HashMap: " + hashMap);
	}

}
