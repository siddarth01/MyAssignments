package week3.day1.org.system;

//Inherit from Parent Class Computer
public class Desktop extends Computer {
 
	public  static void  desktopSize() {
		
		System.out.println("The desktop size is 15 inch");
		
	}
	
	public static void main(String[] args) {
		
		//Create an object
		Desktop obj1 = new Desktop();
		
		//Call Parent Class Method
		obj1.computerModel();
		
		//Call Method in this class
		desktopSize();
		
	}
}
