package com.svkp.bankAcc.Application;

import com.svkp.bankAcc.FramWork.CurrentAcc;

public class GsCurrentAcc extends CurrentAcc {

	public GsCurrentAcc(int accno, String accname, float accBal, boolean deposit) {
		super(accno, accname, accBal, deposit);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String toString() {
		return "GsCurrentAcc [accountbalance=" + accountbalance + ", accno=" + accno + ", accname=" + accname
				+ ", accBal=" + accBal + "]";
	}

}