package com.svkp.shopacc.application;

import com.svkp.shopacc.framwork.PrimeAcc;

public class GsPrimeAcc extends PrimeAcc {

	private static final float charges=0;
	
	public GsPrimeAcc(int accno, String accname, float charges, boolean isPrime) {
		super(accno, accname, charges, isPrime);
		
	}
	

	@Override
	public void bookproduct(float charges) {
		System.out.println("Dear prime user,your product charges"+charges);
	}
	@Override
	public String toString() {
		return "GsPrimeAcc [accno=" + accno + ", accname=" + accname + ", charges=" + charges + "]";
	}
	

}
