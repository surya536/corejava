package com.svkp.bankAcc.FramWork;

public class BankAcc {
    public int  accno;
    public String accname;
    public float accBal;
    
	public BankAcc(int accno, String accname, float accBal, boolean deposit) {
		super();
		this.accno = accno;
		this.accname = accname;
		this.accBal = accBal;
	}
	public void withdrow(float charges) {
		
	}
	public void  deposit(float charges) {
		
	}
	@Override
	public String toString() {
		return "BankAcc [accno=" + accno + ", accname=" + accname + ", accBal=" + accBal + "]";
	}
}
