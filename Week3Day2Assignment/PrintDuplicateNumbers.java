package week3.day2.Collectionprograms.Assignment2;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateNumbers {
	public static void main(String[] args) {

		int[] data = { 4, 3, 6, 8, 29, 1, 2, 4, 7, 8 };
		
		boolean check=true;
		
		Set<Integer> myset = new HashSet<Integer>();
		
		System.out.println("The duplicate values in Array are:");
		
		// Iterate all values in array
		for(int i=0;i<data.length;i++) {
			
			//Add Value to set
			check = myset.add(data[i]);
			
			//If it is already there in the Set -> Print duplicate
			
			if(check==false)
				System.out.println(data[i]);
		}

	}
}
