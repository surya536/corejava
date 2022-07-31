package com.svkp.shopacc.framwork;

public class NormalAcc extends ShopAcc{
	public final float delevirycharges;

	public NormalAcc(int accno, String accname, float charges, float delevirycharges) {
		super(accno, accname, charges);
		this.delevirycharges = 0;
	}

	@Override
	public String toString() {
		return "NormalAcc [delevirycharges=" + delevirycharges + "]";
	}
	
	

}