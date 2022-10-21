package week3.day2.Collectionprograms.Assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		// Declare a String as PayPal India
		String str = "PayPal India";

		// Convert it into a character array

		char[] words = str.toCharArray();

		// Declare a Set as charSet for Character
		Set<Character> charSet = new HashSet<Character>();

		// Declare a Set as dupCharSet for duplicate Character

		Set<Character> dupCharSet = new HashSet<Character>();

		// Iterate character array and add it into charSet

		for (char c : words) {

			charSet.add(c);
		}

		List<char[]> wordlist = new ArrayList<>(Arrays.asList(words));
		// if the character is already in the charSet then, add it to the dupCharSet

		for (char c : charSet) {

			if (wordlist.contains(c)) {

				dupCharSet.add(c);

			}
		}

		List<Character> charSetList = new ArrayList<>(charSet);

		// Check the dupCharSet elements and remove those in the charSet

		for (char d : dupCharSet) {

			charSetList.remove(d);
		}

		Set<Character> charSet1 = new HashSet<Character>(charSetList);

		// Check the iterator variable isn't equals to an empty space

		System.out.println("The characters in Charset are :");

		for (char c : charSet1) {

			if (!Character.isWhitespace(c))
				System.out.println(c);
		}

	}

}
