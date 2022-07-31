package com.svkp.bankAcc.Application;

import com.svkp.bankAcc.FramWork.SavingAcc;

public class GsSavingAcc extends SavingAcc {
	
	 private boolean balance;
	private static final float accountbalance = 0;

	public GsSavingAcc(int accno, String accname, float accBal,boolean withdraw) {
		super(accno, accname, accBal,withdraw);
		// TODO Auto-generated constructor stub
	}

    public void withdrow(float accBal) {
		System.out.println("Dear custamer,your Accoutbal"+ accountbalance);
	}

	@Override
	public String toString() {
		return "GsSavingAcc [accno=" + accno + ", accname=" + accname + ", accBal=" + accBal + "]";
	}

}
