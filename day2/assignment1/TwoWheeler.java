package week1.day2.assignment1;

public class TwoWheeler {

	// Initialize Global Variables
	int noOfWheels = 2;

	short noOfMirrors = 2;

	long chassisNumber = 78987678;

	boolean isPunctured = false;

	String bikeName = "Apache";

	double runningKM = 2006.87;

	public static void main(String[] args) {

		TwoWheeler obj = new TwoWheeler();

		System.out.println("The number of wheels is " + obj.noOfWheels);

		System.out.println("The number of mirrors is " + obj.noOfMirrors);

		System.out.println("The chassisnumber  is " + obj.chassisNumber);

		System.out.println("Is Bike Punctured " + obj.isPunctured);

		System.out.println("The bike name is " + obj.bikeName);

		System.out.println("The total running KM " + obj.runningKM);

	}
}
