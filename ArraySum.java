package array;
import java.util.*;
public class ArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no.of elements in the array: ");
		int n = sc.nextInt();
		int[] numbers=new int[n];
		int sum=0;
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++)
		{
			numbers[i]=sc.nextInt();
			sum+=numbers[i];
		}
		System.out.println("Sum of all elements in the array is:"+sum);

	}
}
