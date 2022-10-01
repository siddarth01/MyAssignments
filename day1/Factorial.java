package week1.day1;

public class Factorial {

	/*
	 * Goal: Find the Factorial of a given number
	 
	 * What are my learnings from this code?
	 * 1) Use of different operators
	 * 2)datatype and variable
	 * 3) looping n time to get output
	 * 
	 */
	public static void main(String[] args) {
	
	//Initialize value of 5	
	int number = 5;
		
	//Initialize value of 1
	int fact = 1;
	
	//Iterating i  value until  less than and equal to number value
	for (int i = 1; i <= number; i++) {
		
		//Multiply fact value with iterated value
		fact = fact * i; 
	}
	
	//Output the value for factorial of 5*4*3*2*1
	System.out.println("The factorial of 5 is " + fact);
	
	}
}
