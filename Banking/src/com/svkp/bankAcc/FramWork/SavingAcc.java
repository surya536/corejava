package com.svkp.bankAcc.FramWork;

public class SavingAcc extends BankAcc{
  
	public static boolean balance;
	
	
    public SavingAcc(int accno, String accname, float accBal,boolean withdraw) {
		
		super(accno, accname, accBal, balance);
		// TODO Auto-generated constructor stub
	}
	
	public void withdrow(float accounbalance) {
		
	}
	@Override
	public String toString() {
		return "SavingAcc [balance1=" + balance + ", accno=" + accno + ", accname=" + accname + ", accBal=" + accBal
				+ "]";
	}

	

}
