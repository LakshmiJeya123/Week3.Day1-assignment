package org.system;

public class Desktop extends Computer{

	
	public void desktopSize() {
		System.out.println("Size (5.6'x7.4')");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Desktop spec=new Desktop();
		spec.computerModel();
		spec.desktopSize();

	}

}
