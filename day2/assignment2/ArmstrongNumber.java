package week1.day2.assignment2;

public class ArmstrongNumber {

	

	/*
	 * Goal: To find whether a number is an Armstrong number or not
	 * 
	 * inputs: 153
	 * output: (1*1*1)+(5*5*5)+(3*3*3) = 153
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a While loop, type 'while' followed by: ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1) Use of while loop
	 * 2) find the cube of value using formula
	 * 3) check the number is armstrong or not
	 * 
	 */
	
	public static void main(String[] args) {
		
		int number = 153;
		
		int orginalnumber=number;
		
		int remainder;
		
		int result=0;
		
		while(number != 0) {
			// Get the last digit
			remainder = number % 10;
			// Cube of the remainder
			result += Math.pow(remainder,3);
			// Remove the last digit
			number =number/10;	
			
			
		}
		
		if(result == orginalnumber) {
			
			System.out.println(orginalnumber + " is an armstrong number");
		}
		
		else {
			System.out.println(orginalnumber + " is not an armstrong number");
			
		}
		
		
		
		
	}
}
