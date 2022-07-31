package com.svkp.shopacc.application;

import com.svkp.shopacc.framwork.NormalAcc;

public class GsNormalAcc extends NormalAcc {

	public GsNormalAcc(int accno, String accname, float charges, float delevirycharges) {
		super(accno, accname, charges, delevirycharges);
		// TODO Auto-generated constructor stub
	}
	public void bookproduct(float charges) {
		System.out.println("Dear prime user,your product charges:" + "+charges" + "with delevirycharges:" +delevirycharges );
	}
	@Override
	public String toString() {
		return "GsNormalAcc [delevirycharges=" + delevirycharges + ", accno=" + accno + ", accname=" + accname
				+ ", charges=" + charges + "]";
	}
     
}
