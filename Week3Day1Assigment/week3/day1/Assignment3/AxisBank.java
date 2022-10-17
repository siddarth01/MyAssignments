package week3.day1.Assignment3;

//Extends the parent Class BankInfo
public class AxisBank extends BankInfo {

	//Deposit Method of Axis Bank
	public void deposit() {
		
		System.out.println("The deposit is 50,000");
	}
	
	public static void main(String[] args) {
		
		//Create object for Axis Bank
		AxisBank axis = new AxisBank();
		
		//Call Method of BankInfo
		axis.saving();
		axis.fixed();
		//Override the method deposit
		axis.deposit();
		
	}
}
