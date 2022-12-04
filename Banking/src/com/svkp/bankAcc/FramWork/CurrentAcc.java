package com.svkp.bankAcc.FramWork;

public class CurrentAcc extends BankAcc {
	public boolean withdrow;
	
    public final float accountbalance = 100;
    
	public CurrentAcc(int accno, String accname, float accBal, boolean deposit) {
		super(accno, accname, accBal, deposit);
		System.out.println("dear user, your balance is suffinanct: " +deposit);
	}

	@Override
	public String toString() {
		return "CurrentAcc [withdrow=" + withdrow + ", accountbalance=" + accountbalance + "]";
	}

	

	
}
