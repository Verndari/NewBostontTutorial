package thenewboston;

import java.util.Random;

public class RandomNumberGenerator {
	public static void main (String [] args) {
		
		Random dice = new Random();						// Create a Dice Object with Random numbers
		int number;										// Define a number var
		
		for(int counter=1; counter<=10;counter++) {		// Define a For counter that counts to 10
			number = 1+dice.nextInt(6);					// Add an Dice that random put Numbers from 1 to 6 (add a +1 to the dice otherwise it would count from 0 to 5)
			System.out.println(number + " ");			// Print out the random dice numbers
		}
		
	}
}
