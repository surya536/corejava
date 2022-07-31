package com.svkp.bankAcc.FramWork;

public class SavingAcc extends BankAcc{
  
	private static boolean balance;
	private  boolean balance1;
	
    public SavingAcc(int accno, String accname, float accBal,boolean withdraw) {
		
		super(accno, accname, accBal, balance);
		// TODO Auto-generated constructor stub
	}
	
	public void withdrow(float accounbalance) {
		
	}
	@Override
	public String toString() {
		return "SavingAcc [balance1=" + balance1 + ", accno=" + accno + ", accname=" + accname + ", accBal=" + accBal
				+ "]";
	}

	

}
