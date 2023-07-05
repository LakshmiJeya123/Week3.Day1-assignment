package org.bank;

public class BankInfo extends AxisBank{

	public void savingsAmt() {
		System.out.println("Savings Amt 60000");
		}
	
	public void fixedAmt() {
		System.out.println("Fixed Amt 50000");
	} 
	
	public void depositAmt() {
		System.out.println("Deposit Amt 90000");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		BankInfo asset=new BankInfo();
		asset.depositAmt();
		asset.fixedAmt();
		asset.savingsAmt();
		
		
		
		
	}

}
