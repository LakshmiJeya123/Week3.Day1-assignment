package org.bank;

public class Student {

	
	int id =31;
	String name="Jeyalakshmi";
	String email="nivejeya@yahoo.com";
	long mobileno=9567329021l;
	
	
	public void getStudentInfo() {
		System.out.println("31");
		System.out.println("Jeyalakshmi");
		System.out.println("nivejeya@yahoo.com");
		System.out.println("9567329021");
	}
	
	
	
	public static void main(String[] args) {
		Student det=new Student();
		det.getStudentInfo();
		
		
	}



}
