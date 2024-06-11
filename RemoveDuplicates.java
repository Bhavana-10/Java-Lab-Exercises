package array;
import java.util.*;
public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        Set<Integer> uniqueElements = new HashSet<>();
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            uniqueElements.add(num);
        }
        System.out.print("Array after removing duplicates: ");
        for (int num : uniqueElements) {
            System.out.print(num + " ");
        }

	}

}
