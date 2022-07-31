package com.svkp.shopacc.framwork;

public class ShopAcc {
	public int accno;
	public String accname;
	public float  charges;
//constrocter
	public ShopAcc(int accno, String accname, float charges) {
		super();
		this.accno = accno;
		this.accname = accname;
		this.charges = charges;
	}
	//methods
	public void bookproduct(float charges) {
		
	}
	public void items(float charges) {
		
	}
	@Override
	public String toString() {
		return "ShopAcc [accno=" + accno + ", accname=" + accname + ", charges=" + charges + "]";
	}
	
}
