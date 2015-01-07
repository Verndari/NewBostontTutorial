package thenewboston;

public class VariableLengthArguments {
	public static void main (String[] args) {
		
		System.out.println(average(43,56,76,8));		// Print out the average to the console (eg. 45)
		
	}
	
	public static int average(int...numbers){			// Create a Method with a var that doesn't know which number it should contains
		int total = 0;									// Create an total Integer
		for(int x:numbers)								// Create a for loop with integer x that contains numbers
			total += x;									// Add total to x
		
		return total/numbers.length;					// return total and the exact amount of numbers
	}
}
