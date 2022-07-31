package com.svkp.shopacc.application;

import com.svkp.shopacc.framwork.NormalAcc;
import com.svkp.shopacc.framwork.PrimeAcc;
import com.svkp.shopacc.framwork.ShopFactor;

public class GsShopFactor implements ShopFactor{

	@Override
	public PrimeAcc getNewPrimeAcc(int accno, String accname, float charges, boolean isPrime) {
		GsPrimeAcc gsprime = new GsPrimeAcc(accno, accname, charges, isPrime);
		
		return null;
	}

	@Override
	public NormalAcc getNewNormalAcc(int acccno, String accname, float charges, float delivarycharges) {
		float delevirycharges = 0;
		GsNormalAcc gsnormal = new GsNormalAcc(acccno, accname, delevirycharges, delevirycharges);
		return null;
	}

	

}
