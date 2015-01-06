package thenewboston;

public class CompoundInterestProgram {
	public static void main (String [] args) {
		
		double amount;				// Amount of the calc we doesn't know actually
		double principal = 10000;	// Amount of yt subs actually
		double rate = .01;			// The 0.1% rate each day
		
		for(int day=1;day<=30;day++) {						// For loop to calc a least 20 days
			amount = principal*Math.pow(1 + rate, day);		// Calc for the amount of subs for every day
			System.out.println("At day "+day+ " You could have: " +amount+ " Subs on YouTube");
		}
		
	}
}
