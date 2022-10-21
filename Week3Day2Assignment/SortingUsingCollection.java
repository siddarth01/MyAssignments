package week3.day2.Collectionprograms.Assignment2;

import java.util.Arrays;

public class SortingUsingCollection {

	public static void main(String[] args) {

		// Declare a String array and add the Strings values as (HCL, Wipro, Aspire
		// Systems, CTS)

		String[] companies = { "HCL", "Wipro", "Aspire Systems", "CTS" };

		// get the length of the array

		int size = companies.length;

		// sort the array

		Arrays.sort(companies);

		// Iterate it in the reverse order

		// Print the companies after sort

		System.out.println("The companies are :");

		for (int i = 0; i < size; i++) {

			System.out.println(companies[i]);
		}

		// iterate to print in reverse

		System.out.println("The companies after reverse are:");
		for (int i = size - 1; i >= 0; i--) {

			System.out.println(companies[i]);
		}

	}
}
