package com.svkp.shopacc.clint;

import com.svkp.shopacc.application.GsShopFactor;
import com.svkp.shopacc.application.GsPrimeAcc;
import com.svkp.shopacc.application.GsNormalAcc;

public class Clint {

	public static void main(String[] args) {
		
		GsShopFactor gsshop = new GsShopFactor();
		gsshop.getNewPrimeAcc(0, null, 0, false);
		gsshop.getNewNormalAcc(2345,"surya",122346, 67);
		
		GsPrimeAcc gsprime=new GsPrimeAcc(124,"padma",3456, true);
		gsprime.bookproduct(7306);
		
		GsNormalAcc gsnormal=new GsNormalAcc(111,"surya",5469,66);
		gsnormal.bookproduct(500);
		
		gsprime.toString();
		gsnormal.toString();
  
	}


}
