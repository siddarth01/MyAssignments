package week1.day2.assignment2;

public class SumOfDigits {
	

	/*
	 * Goal: Find the sum of digits of a given number
	 * 
	 * input: 123
	 * output: 1+2+3 = 6
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'while' loop: type 'while', followed by ctrl + space + enter
	 *   
	 * What are my learnings from this code?
	 * 1) use of while loop
	 * 2) get remainder of number /last digit of a number
	 * 3) remove last digit
	 * 
	 */

	public int sum(int number) {

		int sum = 0;

		// Check until number is zero
		while (number != 0) {

			// Get the last digit
			sum = sum + number % 10;

			// Remove the last digit
			number = number / 10;

		}
		return sum;
	}

	public static void main(String[] args) {

		SumOfDigits obj = new SumOfDigits();

		int number = 123;
		int sumOfDigits = obj.sum(number);

		System.out.println("The sum of digits for " + number + " is " + sumOfDigits);

	}
}
