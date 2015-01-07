package thenewboston;

public class TableForMultiArrays {

	public static void main(String[] args) {

		int firstarray[][] =  {{8,9,10,11}, {12,13,14,15}};			// Define a multi array with 2 rows
		int secondarray[][] = {{30,31,32,33},{43},{4,5,6}};			// Define a mutli array with 3 rows
		
		System.out.println("This is the first array");				// Print out Text to the console
		display(firstarray);							// Print out the arrays in rows and columns of array "first"
		
		System.out.println("This is the second array");				// Print out Text to the console
		display(secondarray);							// Print out the arrays in rows and columns of array "second"
		
	}
	
	public static void display(int x [][]) {					// Create a new var to display the rows
		for (int row=0;row<x.length;row++){					// Create a for loop for the exact length of the array
			for(int column=0;column<x[row].length;column++){		// Create a for loop that loops through the rows
				System.out.print(x[row][column]+"\t");			// Print out rows and collumns from
			}
			
			System.out.println();						// Print out spaces
			
		}
	}
	
}

// Console print
//This is the first array
//8		9		10		11	
//12	13		14		15	
//This is the second array
//30	31		32		33	
//43	
//4		5		6
