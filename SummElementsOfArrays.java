package thenewboston;

public class SummElementsOfArrays {

	public static void main(String[] args) {
		
		int bucky[]	= {21,16,86,21,3};								// Define a new bucky integer with an array initialiser
		int sum = 0;												// Define a sum integer
		
		for(int counter=0;counter<bucky.length;counter++) {			// Create a For counter Loop with the length from the array
			sum += bucky[counter];									// Loops through the whole array and creates the sum of it
		}
		
		System.out.println("The sum of these numbers is " +sum);	// Print out the sum of the array (eg. 147)

	}
}
