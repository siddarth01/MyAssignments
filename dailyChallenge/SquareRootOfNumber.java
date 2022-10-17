package dailyChallenge;

public class SquareRootOfNumber {

	// method to find the squareroot
	public int findSquareroot(int number) {

		// intialize value square
		int square = 0;

		// loop for half of input number starting from 1
		for (int i = 1; i <= number / 2; i++) {
			
			//get the quotient of the number by iteration
			square = number / i;

			// Check both iterated value and quotient are equal
			if (i == square) {

				System.out.println("The square root of a number is ");
				break;
			}
		}

		return square;
	}

	public static void main(String[] args) {

		SquareRootOfNumber obj = new SquareRootOfNumber();

		int squareroot = obj.findSquareroot(144);

		System.out.println(squareroot);

	}
}
