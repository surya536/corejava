package com.svkp.bankAcc.clint;

import com.svkp.bankAcc.Application.GsBankFactory;
import com.svkp.bankAcc.Application.GsCurrentAcc;
import com.svkp.bankAcc.Application.GsSavingAcc;

public class Clint {

	public static void main(String[] args) {
		GsBankFactory gsbankfac= new GsBankFactory();
		gsbankfac.getNewSavingAccount(0, null, 0, true);
		gsbankfac.getNewCurrentAccount(123, "suraj", 23456, false);
		
		GsSavingAcc gssaving = new GsSavingAcc(125,"krishna",123454,true);
		gssaving.withdrow(12344);
		
		GsCurrentAcc gscurrent = new GsCurrentAcc(234,"ram",56478,true);
		gscurrent.deposit(345);
		

	}
}
