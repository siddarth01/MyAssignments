package week3.day1.Assignment4;

public class Students {

	//Only ID as argument
	public static void getStudentInfo(int id) {

		System.out.println("The student ID is " + id);
	}

	//ID and Name as argument
	public static void getStudentInfo(int id, String name) {

		System.out.println("The student ID is " + id + "The student name is " + name);
	}

	//Email and Phonenumber as argument
	public static void getStudentInfo(String email, int phoneNumber) {

		System.out.println("The email of Student is " + email + " The phonenumber is" + phoneNumber);
	}
	
	public static void main(String[] args) {
		
		
		//Method Overloading Done
		getStudentInfo(23);
		getStudentInfo(23,"Jaya");
		getStudentInfo("jaya01@abc.org",987689000);
		
	}
}
