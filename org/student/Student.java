package org.student;

import org.department.Department;

public class Student extends Department{

	
	public void studentName() {
		System.out.println("Jeyalakshmi");
	}
	
	public void studentDept() {
		System.out.println("EIE");
	}
	
	public void studentID() {
		System.out.println("1514668");
	}
	
	
	
	
	
	public static void main(String[] args) {
        Student edu=new Student();
        edu.collegeName();
        edu.collegeCode();
        edu.collegeRank();
        edu.deptName();
        edu.studentName();
        edu.studentDept();
        edu.studentID();
		
	}

}
