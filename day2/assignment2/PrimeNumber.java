package week1.day2.assignment2;

public class PrimeNumber {

	public static void main(String[] args) {
		
		boolean check =false;
		
		int number = 9;
		
		if(number <=1) {
			
			System.out.println("The number " +number+ " is not a prime number ");
		}
		
		// Iterate from 1 to half of the input
		for (int i=1; i < number/2;i++) {
			
			if(number % i == 0) {
				
				check=true;
				
				break;
			}
		}
		
		if(check == false)
			
			System.out.println("The number " +number+ " is  a prime number ");
		else
			System.out.println("The number " +number+ " is not a prime number ");
	}
}
