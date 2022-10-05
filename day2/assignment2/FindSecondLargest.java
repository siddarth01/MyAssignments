package week1.day2.assignment2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {

		// initialize an array
		int[] array = { 3, 45, 78, 87, 3, 10 };
        
		//Sort array in ascending order
		Arrays.sort(array);
		
		//Print the second largest
		System.out.println("The second largest in the array is: " + array[array.length -2]);
		
}
}

