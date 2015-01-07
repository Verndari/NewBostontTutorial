package thenewboston;

public class ArraysInMethods {

	public static void main(String[] args) {
		
		int bucky[] = {3,4,5,6,7};							// Define a Integer var with an array of numbers
		change(bucky);										// Call the change function and tell him what to do with bucky
		
		for(int y:bucky)
			System.out.println(y);							// Print out the changed array to the console (8 9 10 11 12)
	}
	
	public static void change(int x[]) {					// Define a change Integer of x
		for (int counter=0;counter<x.length;counter++)		// Create an counter for x and add +1 to it
			x[counter] += 5;								// Count +5 with every number at the array
	}
	
}
