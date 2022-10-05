package week1.day2.assignment2;

public class CheckIfTheNumberIsPositiveOrNegative {

	public static void main(String[] args) {
		
		//Initialize a number, say, int number= 35
		int num = 35;

		// If the number is greater than zero
		if (num > 0) {

			System.out.println("The number " + num + " is positive");
		}

		// If the number is lesser than zero
		else if (num < 0) {

			System.out.println("The number " + num + " is negative");
		}

		// If the number is either positive or negative
		else {

			System.out.println("The number " + num + " is either positive or negative");
		}
	}
}
