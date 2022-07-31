package com.svkp.shopacc.framwork;

public interface ShopFactor {
	public abstract PrimeAcc getNewPrimeAcc(int accno, String accname, float charges, boolean isPrime);
	
	public abstract NormalAcc getNewNormalAcc(int acccno, String accname, float charges, float delivarycharges);

}
