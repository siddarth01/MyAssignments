package week3.day2.Collectionprograms.Assignment2;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {

		// String is declared as input

		String text = "We learn java basics as part of java sessions in java week1";

		// Split the String based on white spaces and save as String Array

		String[] words = text.split("\\s");

		System.out.println("The words are ");
		
		// Create a empty Set 
		
		System.out.println("The unique words are : ");
		
		Set <String> emptySet = new LinkedHashSet<String>();
		
		//System.out.println("Empty set: "+emptySet);
		
		//Iterate the String array
		
		for (String character : words) {
			
			
			//add each word into Set
			emptySet.add(character);
			
			
			//print unique words
			
			
		}
		
		System.out.println(emptySet.toString());
		
		
		
		
		}

	}

