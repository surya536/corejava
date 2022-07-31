package com.svkp.shopacc.framwork;

public class PrimeAcc extends ShopAcc {
    private boolean isPrime;
    private static final float delevirycharges = 0;
	public PrimeAcc(int accno, String accname, float charges, boolean isPrime) {
		super(accno, accname, charges);

	}
	public void product(float charges) {

	}
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", accno=" + accno + ", accname=" + accname + ", charges=" + charges
				+ "]";
	}
	
	
	

}
