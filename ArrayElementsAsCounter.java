package thenewboston;

import java.util.Random;

public class ArrayElementsAsCounter {

	public static void main(String[] args) {
		
		Random rand = new Random();					// Define a random number
		int freq[] = new int[7];					// Create a frequency integer
		
		for(int roll=1;roll<1000;roll++) {				// Create a for loop that rolls thousand times a dice
			++freq[1+rand.nextInt(6)];				// Added +1 to the Index of freq. and instead of 0 to 5 we add a +1 to count him from 1 to 6
		}
		
		System.out.println("Face\tFrequency");				// Print out an Header to the console
		
		for(int face=1;face<freq.length;face++) {			// Create a for loop for the face and set it less the freq.length to let it count from 1 to 6
			System.out.println(face+"\t"+freq[face]);		// Print out Face and the Value of freq. So that it counts how many times a number was rolled during the 1000 rolls.
		}
				
	}
}
//										Face	Frequency
//										1	182
//										2	154
//										3	186
//										4	164
//										5	164
//										6	149
