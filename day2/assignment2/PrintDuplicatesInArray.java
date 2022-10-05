package week1.day2.assignment2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		// Initialize an array

		int[] array = {14,12,13,11,15,14,18,16,17,19,18,17,20};

		int size = array.length;

		System.out.println("The duplicates in array are");

		for (int i = 0; i < size; i++) {

			for (int j = i + 1; j < size; j++) {

				if (array[i] == array[j]) {

					System.out.println(array[j]);
				}
			}
		}
	}
}
