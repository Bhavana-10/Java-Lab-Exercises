package collections;
import java.util.HashSet;
public class HashSetExample {
	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        System.out.println("Elements of the set: " + numbers);
        boolean contains10 = numbers.contains(10);
        System.out.println("Does the set contain the number 10? " + contains10);
        boolean removed = numbers.remove(15);
        System.out.println("Was the number 15 removed? " + removed);
        int size = numbers.size();
        System.out.println("Size of the set: " + size);
	}

}
