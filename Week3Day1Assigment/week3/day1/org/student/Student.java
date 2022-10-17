package week3.day1.org.student;

import week3.day1.org.department.Department;

//Extended the parent class Department
public class Student extends Department {

	public void studentName() {

		System.out.println("The student name is Rex");
	}

	public void studentDept() {

		System.out.println("The student department is ECE");
	}

	public void studentId() {

		System.out.println("The student ID is BDC1234");
	}

	public static void main(String[] args) {
		
		
		Student obj1 = new Student();
		//Use of Multi level inheritance
		obj1.collegeName();
		obj1.collegeCode();
		obj1.collegeRank();
		obj1.deptName();
		obj1.studentName();
		obj1.studentDept();
		obj1.studentId();

	}
}
