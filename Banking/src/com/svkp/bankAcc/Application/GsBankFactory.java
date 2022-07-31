package com.svkp.bankAcc.Application;

import com.svkp.bankAcc.FramWork.BankFactory;
import com.svkp.bankAcc.FramWork.CurrentAcc;
import com.svkp.bankAcc.FramWork.SavingAcc;

public class GsBankFactory implements BankFactory {

	@Override
	public SavingAcc getNewSavingAccount(int accno, String accname, float accBal, boolean withdraw) {
		GsSavingAcc gssaving = new GsSavingAcc(accno, accname, accBal, withdraw);
		return null;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accno, String accname, float accBal, boolean deposit) {
		return null;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accno, String accname, float accBal, boolean deposit) {
		// TODO Auto-generated method stub
		return null;
	}

}
