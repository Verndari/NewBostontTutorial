package thenewboston;

public class CreatingAnArrayTable {

	public static void main(String[] args) {
		
		System.out.println("Index\tValue");							// Print out "Index" and "Value" to the console with a "\t" Tab space between
		int bucky[] = {32,12,18,54,2};								// Define a new bucky integer with an empty array and an array initialiser with 5 numbers
		
		for(int counter=0;counter<bucky.length;counter++) {			// Create a counter that counts the length of the string (0 to 4) 
			System.out.println(counter + "\t" + bucky[counter]);	// Print out the counter (0 to 4) and the var bucky with the entire array (32 to 2)
		}
		
	}
}
