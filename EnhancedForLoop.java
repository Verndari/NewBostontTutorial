package thenewboston;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		int bucky[] = {3,4,5,6,7};				// Define a var with a String of numbers
		int total = 0;							// Define a sum Integer to add the numbers
		
		for(int x: bucky) {						// Enhanced for loop it counts all numbers in the var
			total += x;							// Sum the numbers in the var
		}
		
		System.out.println(total);				// Print out the Sum 25 to the console

	}
}
